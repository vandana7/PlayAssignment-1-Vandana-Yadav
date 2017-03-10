package controllers

import javax.inject.Inject

import model.Users
import play.api.mvc.{Action, Controller}
import services.CacheHandling


class AdminPageController @Inject()(cache:CacheHandling) extends Controller{

  def suspend(usrname:String) =Action {  implicit request =>
    val allData:Option[Users] = cache.fetchDataFromCache(usrname)
    val finaluser = cache.fetchedData(allData)
    val updatedData = finaluser.copy(isAllowed=false)
    cache.removeFromCache(usrname)
    cache.setValueInCache(usrname,updatedData)
    Redirect(routes.ProfileController.manageAcounts())
  }

  def resume(usrname:String) =Action {  implicit request =>
    val allData:Option[Users] = cache.fetchDataFromCache(usrname)
    val finaluser = cache.fetchedData(allData)
    val updatedData = finaluser.copy(isAllowed=true)
    cache.removeFromCache(usrname)
    cache.setValueInCache(usrname,updatedData)
    Redirect(routes.ProfileController.manageAcounts())
  }

}
