package controllers

import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import model.Users
import services.{AddUser, MockDatabase}

class SignUpController @Inject() extends Controller {




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
      "hobbies" -> nonEmptyText
    )(Users.apply)(Users.unapply)
  )

  def processData = Action {implicit request=>
      usersForm.bindFromRequest.fold(
      formWithErrors => {
        Redirect(routes.HomeController.signupPage)
      },
        data => {
        val stream = usersForm.bindFromRequest.get
        val list = MockDatabase.listOfUsers
         if(!list.contains(stream.username)){
            if(stream.pwd==stream.repwd) {
              if(stream.mobileNo.length==10) {
                AddUser.addUser(data)
                Redirect(routes.HomeController.profilePage).withSession("User"->data.username)
              }
              else Redirect(routes.HomeController.signupPage).flashing("reason"->"invalis mobile no")
            }
            else Redirect(routes.HomeController.signupPage).flashing("reason"->"passwords doesn't match")

          }
           else Redirect(routes.HomeController.signupPage).flashing("reason" -> "user name already exist")

      }
    )
  }

}
