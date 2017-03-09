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

       println(data)

        val datafromcache = cache.fetchedData(cache.fetchDataFromCache(data.username))
       println(datafromcache)

       val encryptedInfo = data.copy(pwd = Encryption.hash(data.pwd))
       println("test:" +encryptedInfo)

       if(datafromcache.username == encryptedInfo.username && datafromcache.pwd == encryptedInfo.pwd) {
         if (datafromcache.isAllowed == true) {
           println("login sucessfull")
           Redirect(routes.HomeController.profilePage()).withSession("User" -> data.username).flashing("msg" -> "Login Successful")
         }
         else {
           println("suspended")
           Redirect(routes.HomeController.loginPage()).flashing("msg" -> "your session is suspended,you cant login,sorry for inconvenience")
         }
       }
       else {
         println("invalid password")
         Redirect(routes.HomeController.loginPage()).flashing("msg" -> "Incorrect username or password")
       }
     }

   )
 }
}
