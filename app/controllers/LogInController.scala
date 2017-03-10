package controllers

import javax.inject.Inject

import model.{LoginAccounts, Users}
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.{Action, Controller}
import services.{CacheHandling, Encryption, MockDatabase}

class LogInController @Inject()(cache:CacheHandling) extends Controller{


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

        val datafromcache = cache.fetchedData(cache.fetchDataFromCache(data.username))
       val encryptedInfo = data.copy(pwd = Encryption.hash(data.pwd))
       if(datafromcache.username == encryptedInfo.username && datafromcache.pwd == encryptedInfo.pwd) {
         if (datafromcache.isAllowed == true) {
           Redirect(routes.HomeController.profilePage()).withSession("User" -> data.username).flashing("msg" -> "Login Successful")
         }
         else {
           Redirect(routes.HomeController.loginPage()).flashing("msg" -> "your session is suspended,you cant login,sorry for inconvenience")
         }
       }
       else {
         Redirect(routes.HomeController.loginPage()).flashing("msg" -> "Incorrect username or password")
       }
     }

   )
 }
}
