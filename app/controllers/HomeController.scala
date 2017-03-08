package controllers

import javax.inject._

import model.Users
import play.api._
import play.api.cache.CacheApi
import play.api.mvc._
import services.{FetchUserData, Service}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cache:CacheApi)extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def homePage = Action {
    Ok(views.html.homePage("home Page"))

  }

  def loginPage = Action {
    Ok(views.html.login("Login Page"))
  }

  def signupPage = Action{
    Ok(views.html.signup("Signup Page"))
  }


//  def profilePage = Action {
//    Ok(views.html.profile("profile Page"))
//
//  }

  def profilePage = Action { implicit request=>

    request.session.get("User").map{ uname=>
//      val obj=new FetchUserData
//      val data=service.fetchData(uname)
     val data = cache.get[Users]("dataincache").get
      Ok(views.html.profilePage(data))
    }.getOrElse{
      Unauthorized("Oops, somthing went  wrong")
    }
  }
}
