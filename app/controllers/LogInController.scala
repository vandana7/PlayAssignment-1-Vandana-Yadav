package controllers

import javax.inject.Inject

import model.{LoginAccounts, Users}

import play.api.cache.CacheApi
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import services.{Encryption, MockDatabase}

class LogInController @Inject()(cache:CacheApi) extends Controller{


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

       println(data)

        val datafromcache = cache.get[Users]("dataincache").get
       println(datafromcache)

       val encryptedInfo = data.copy(pwd = Encryption.hash(data.pwd))
       println("test:" +encryptedInfo)

       if(datafromcache.username == encryptedInfo.username && datafromcache.pwd == encryptedInfo.pwd)
       {

          println("login sucessfull")
         Redirect(routes.HomeController.profilePage()).withSession("User"->data.username).flashing("msg"->"Login Successful")
       }
       else {
         println("invalid password")
         Redirect(routes.HomeController.loginPage()).flashing("msg" -> "Incorrect username or password")
       }
     }

   )
 }
}
