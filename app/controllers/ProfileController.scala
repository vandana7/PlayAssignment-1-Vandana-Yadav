package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
import services.CacheHandling


class ProfileController @Inject() (cache:CacheHandling)extends Controller {

  def logout = Action{ implicit request=>

    Redirect(routes.HomeController.homePage()).withNewSession
  }

  def manageAcounts = Action { implicit request =>
//    request.session.get("User").map{ uname=>
////      val datafromcache = cache.fetchedData(cache.fetchDataFromCache(uname))
//      Ok(views.html.manageProfile(datafromcache))
//    }.getOrElse{
//      Unauthorized("Oops, somthing went  wrong")
//    }
    val data = cache.dataToManage()
    println(data)
    Ok(views.html.manageProfile(data))
  }




}
