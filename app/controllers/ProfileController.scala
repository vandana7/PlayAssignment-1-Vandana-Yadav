package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}
import services.CacheHandling


class ProfileController @Inject() (cache:CacheHandling)extends Controller {

  def logout = Action{ implicit request=>

    Redirect(routes.HomeController.homePage()).withNewSession
  }

  def manageAcounts = Action { implicit request =>
    val data = cache.dataToManage()
    Ok(views.html.manageProfile(data))
  }




}
