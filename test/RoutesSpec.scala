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


  "HomeController" should {

    "render the signup page" in {
      val signup = route(app, FakeRequest(GET, "/signup")).get

      status(signup) mustBe OK
      contentType(signup) mustBe Some("text/html")
      contentAsString(signup) must include ("Signup Page")
    }

  }
  "HomeController" should {

    "render the login page" in {
      val login  = route(app, FakeRequest(GET, "/login")).get

      status(login) mustBe OK
      contentType(login) mustBe Some("text/html")
      contentAsString(login) must include ("Login Page")
    }

  }

  "HomeController" should {

    "render the Profile page" in {
      val profilePage  = route(app, FakeRequest(GET, "/profile")).get
      contentAsString(profilePage) must include ("Oops, somthing went  wrong")
    }

  }
  "LoginController" should {

    "render the Login page" in {
      val loginProcess  = route(app, FakeRequest(GET, "/processinlogin")).get

    }

  }
  "ProfileController" should {

    "render the home page after logiut" in {
      val logout  = route(app, FakeRequest(GET, "/logout ")).get

    }

  }

}
