import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

class RoutesSpec extends PlaySpec with OneAppPerTest{

  "HomeController" should {

    "render the home page" in {
      val home = route(app, FakeRequest(GET, "/")).get

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("hello this is our home page")
    }

  }
//  "HomeController" should {
//
//    "render the index page" in {
//      val home = route(app, FakeRequest(GET, "/")).get
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/html")
//      contentAsString(home) must include ("Get me an Account!")
//    }
//
//  }

}
