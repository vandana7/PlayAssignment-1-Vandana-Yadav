package controllers

import javax.inject.Inject

import model.LoginAccounts
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import services.MockDatabase

class LogInController @Inject() extends Controller{


  val logInForm =Form(
    mapping (
      "username" -> nonEmptyText,
      "pwd" -> nonEmptyText
    )(LoginAccounts.apply)(LoginAccounts.unapply)
  )


 def loginProcess = Action { implicit request =>
   logInForm.bindFromRequest.fold(
     formWithErrors => {
       println(formWithErrors)
       Redirect(routes.HomeController.loginPage).flashing(
         "error" -> "Something went Wrong Please Try Again later")
     },
     data => {
       val stream = logInForm.bindFromRequest.get
       println(stream)
       val list = MockDatabase.listOfUsers
       println(list)
       val resultlist =  list.map( element=>

         if(element.username == stream.username && element.pwd == stream.pwd) true
         else false
       )

       if(resultlist.contains(true)){

          println("login sucessfull")
         Redirect(routes.HomeController.profilePage()).withSession("User"->data.username).flashing("msg"->"Login Successful")
       }
       else
         Redirect(routes.HomeController.loginPage()).flashing("msg"->"Incorrect username or password")

     }

   )
 }
}
