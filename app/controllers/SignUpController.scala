package controllers

import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import model.Users
import services.{CacheHandling, Encryption, MockDatabase}

class SignUpController @Inject()(cache:CacheHandling) extends Controller {




  val usersForm = Form(
    mapping(
      "firstname" -> nonEmptyText,
      "middlename" -> text,
      "lastname" -> nonEmptyText,
      "username" -> nonEmptyText,
      "pwd" -> nonEmptyText,
      "repwd" -> nonEmptyText,
      "mobileNo" -> nonEmptyText,
      "gender" -> nonEmptyText,
      "age" -> number(min = 18, max = 75),
      "hobbies" -> nonEmptyText,
      "isAdmin"-> boolean,
      "isAllowed"->boolean
    )(Users.apply)(Users.unapply)
  )

  def processData = Action {implicit request=>
      usersForm.bindFromRequest.fold(
      formWithErrors => {
        Redirect(routes.HomeController.signupPage())
      },
        data =>{

          val dataToCheck = cache.dataToManage()
          if(!dataToCheck.contains(data.username)){
            if(data.pwd==data.repwd) {
              if(data.mobileNo.length==10) {


               val encryptedInfo = data.copy(pwd = Encryption.hash(data.pwd))
                cache.setValueInCache(data.username,encryptedInfo)
                Redirect(routes.HomeController.profilePage()).withSession("User"->data.username)
              }
              else {
                Redirect(routes.HomeController.signupPage()).flashing("reason" -> "invalis mobile no")

              }
            }
            else {
              Redirect(routes.HomeController.signupPage()).flashing("reason"->"passwords doesn't match")
            }

          }
           else {
            Redirect(routes.HomeController.signupPage()).flashing("reason" -> "user name already exist")
         }

      }
    )
  }

}
