package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}

/**
  * Created by knoldus on 6/3/17.
  */
class ProfileController @Inject() extends Controller {

  def logout = Action{ implicit request=>

    Redirect(routes.HomeController.homePage()).withNewSession
  }

}
