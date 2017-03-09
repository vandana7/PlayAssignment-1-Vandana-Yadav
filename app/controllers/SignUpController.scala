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
        data => {
       // val list = MockDatabase.listOfUsers
//         if(!list.contains(data.username))
          val dataToCheck = cache.dataToManage()
          if(!dataToCheck.contains(data.username)){
            if(data.pwd==data.repwd) {
              if(data.mobileNo.length==10) {
//                service.addUser(data)
                println(data)
               val encryptedInfo = data.copy(pwd = Encryption.hash(data.pwd))
                println(encryptedInfo)
                cache.setValueInCache(data.username,encryptedInfo)

                Redirect(routes.HomeController.profilePage()).withSession("User"->data.username)
              }
              else {

                Redirect(routes.HomeController.signupPage()).flashing("reason" -> "invalis mobile no")

              }
            }
            else {
              println("password error")
              Redirect(routes.HomeController.signupPage()).flashing("reason"->"passwords doesn't match")
            }

          }
           else {
           println("user exist error")
           Redirect(routes.HomeController.signupPage()).flashing("reason" -> "user name already exist")
         }

      }
    )
  }

}
