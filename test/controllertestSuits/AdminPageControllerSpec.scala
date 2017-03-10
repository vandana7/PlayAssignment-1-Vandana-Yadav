package controllertestSuits

import controllers.AdminPageController
import model.Users
import org.mockito.Mockito.when
import org.mockito.Mockito._
import play.api.test.FakeRequest
import play.api.test.Helpers.{contentAsString, contentType, status, _}
import services.CacheHandling
import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play._


class AdminPageControllerSpec extends PlaySpec with OneAppPerTest with MockitoSugar {

  "AdminPageController" should {
//    val allData:Option[Users] = cache.fetchDataFromCache(usrname)
//    val finaluser = cache.fetchedData(allData)
//    val updatedData = finaluser.copy(isAllowed=false)
//    cache.removeFromCache(usrname)
//    cache.setValueInCache(usrname,updatedData)
//    Redirect(routes.ProfileController.manageAcounts())

    "suspend" in {
      val cache = mock[CacheHandling]
      val obj = new AdminPageController(cache)
      val user: Users = Users("vandana", "", "yadav", "vandy", "vandy123", "vandy123", "9891272119", "female", 24, "reading", true, true)
      cache.setValueInCache("vandy", user)
      val userDetails: Option[Users] = cache.fetchDataFromCache("vandy")

     when(userDetails) thenReturn Some(user)
      val home = obj.suspend("vandy").apply(FakeRequest(GET,"/suspended"))
      status(home) equals 303
    }




  }
}
