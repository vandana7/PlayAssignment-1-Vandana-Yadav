package controllertestSuits

import controllers.ProfileController
import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play._
import play.api.test.FakeRequest
import services.CacheHandling
import play.api.test.Helpers.{contentAsString, contentType, status, _}


class ProfileControllerSpec extends PlaySpec with OneAppPerTest with MockitoSugar {

  "ProfileController" should {
//    "logout" in {
//      //val showObj = new ProfileController
//      val home = logout.apply(FakeRequest())
//      status(home) equals 303
//    }

    "manage page" in {
      val customCache = mock[CacheHandling]
      val showObj = new ProfileController(customCache)
      val home = showObj.manageAcounts().apply(FakeRequest())
      status(home) equals 200
    }

  }
}
