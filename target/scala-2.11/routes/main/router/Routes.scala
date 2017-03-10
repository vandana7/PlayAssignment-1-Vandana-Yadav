
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/conf/routes
// @DATE:Fri Mar 10 05:36:31 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  CountController_2: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:17
  HomeController_3: controllers.HomeController,
  // @LINE:26
  SignUpController_1: controllers.SignUpController,
  // @LINE:29
  LogInController_0: controllers.LogInController,
  // @LINE:36
  ProfileController_6: controllers.ProfileController,
  // @LINE:43
  AdminPageController_5: controllers.AdminPageController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    CountController_2: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:17
    HomeController_3: controllers.HomeController,
    // @LINE:26
    SignUpController_1: controllers.SignUpController,
    // @LINE:29
    LogInController_0: controllers.LogInController,
    // @LINE:36
    ProfileController_6: controllers.ProfileController,
    // @LINE:43
    AdminPageController_5: controllers.AdminPageController
  ) = this(errorHandler, CountController_2, AsyncController_4, Assets_7, HomeController_3, SignUpController_1, LogInController_0, ProfileController_6, AdminPageController_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, CountController_2, AsyncController_4, Assets_7, HomeController_3, SignUpController_1, LogInController_0, ProfileController_6, AdminPageController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.homePage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signupPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processinsignup""", """controllers.SignUpController.processData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processinlogin""", """controllers.LogInController.loginProcess"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profilePage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.ProfileController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminpage""", """controllers.ProfileController.manageAcounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resume""", """controllers.AdminPageController.resume(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suspended""", """controllers.AdminPageController.suspend(username:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_CountController_count0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count0_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message1_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_homePage3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_homePage3_invoker = createInvoker(
    HomeController_3.homePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "homePage",
      Nil,
      "GET",
      """ for home page""",
      this.prefix + """"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_loginPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginPage4_invoker = createInvoker(
    HomeController_3.loginPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginPage",
      Nil,
      "GET",
      """for login Page""",
      this.prefix + """login"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_signupPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signupPage5_invoker = createInvoker(
    HomeController_3.signupPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupPage",
      Nil,
      "GET",
      """ for signup""",
      this.prefix + """signup"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SignUpController_processData6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processinsignup")))
  )
  private[this] lazy val controllers_SignUpController_processData6_invoker = createInvoker(
    SignUpController_1.processData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "processData",
      Nil,
      "POST",
      """for process in signup""",
      this.prefix + """processinsignup"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LogInController_loginProcess7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processinlogin")))
  )
  private[this] lazy val controllers_LogInController_loginProcess7_invoker = createInvoker(
    LogInController_0.loginProcess,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogInController",
      "loginProcess",
      Nil,
      "POST",
      """for process in login""",
      this.prefix + """processinlogin"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_profilePage8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profilePage8_invoker = createInvoker(
    HomeController_3.profilePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profilePage",
      Nil,
      "GET",
      """for profile page from sign up page""",
      this.prefix + """profile"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ProfileController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_ProfileController_logout9_invoker = createInvoker(
    ProfileController_6.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "logout",
      Nil,
      "GET",
      """for logout""",
      this.prefix + """logout"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ProfileController_manageAcounts10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminpage")))
  )
  private[this] lazy val controllers_ProfileController_manageAcounts10_invoker = createInvoker(
    ProfileController_6.manageAcounts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "manageAcounts",
      Nil,
      "GET",
      """route for adminpage""",
      this.prefix + """adminpage"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AdminPageController_resume11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resume")))
  )
  private[this] lazy val controllers_AdminPageController_resume11_invoker = createInvoker(
    AdminPageController_5.resume(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminPageController",
      "resume",
      Seq(classOf[String]),
      "GET",
      """ for suspending a user""",
      this.prefix + """resume"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_AdminPageController_suspend12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suspended")))
  )
  private[this] lazy val controllers_AdminPageController_suspend12_invoker = createInvoker(
    AdminPageController_5.suspend(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminPageController",
      "suspend",
      Seq(classOf[String]),
      "GET",
      """for resuming""",
      this.prefix + """suspended"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_CountController_count0_route(params) =>
      call { 
        controllers_CountController_count0_invoker.call(CountController_2.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message1_route(params) =>
      call { 
        controllers_AsyncController_message1_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_homePage3_route(params) =>
      call { 
        controllers_HomeController_homePage3_invoker.call(HomeController_3.homePage)
      }
  
    // @LINE:20
    case controllers_HomeController_loginPage4_route(params) =>
      call { 
        controllers_HomeController_loginPage4_invoker.call(HomeController_3.loginPage)
      }
  
    // @LINE:23
    case controllers_HomeController_signupPage5_route(params) =>
      call { 
        controllers_HomeController_signupPage5_invoker.call(HomeController_3.signupPage)
      }
  
    // @LINE:26
    case controllers_SignUpController_processData6_route(params) =>
      call { 
        controllers_SignUpController_processData6_invoker.call(SignUpController_1.processData)
      }
  
    // @LINE:29
    case controllers_LogInController_loginProcess7_route(params) =>
      call { 
        controllers_LogInController_loginProcess7_invoker.call(LogInController_0.loginProcess)
      }
  
    // @LINE:33
    case controllers_HomeController_profilePage8_route(params) =>
      call { 
        controllers_HomeController_profilePage8_invoker.call(HomeController_3.profilePage)
      }
  
    // @LINE:36
    case controllers_ProfileController_logout9_route(params) =>
      call { 
        controllers_ProfileController_logout9_invoker.call(ProfileController_6.logout)
      }
  
    // @LINE:39
    case controllers_ProfileController_manageAcounts10_route(params) =>
      call { 
        controllers_ProfileController_manageAcounts10_invoker.call(ProfileController_6.manageAcounts)
      }
  
    // @LINE:43
    case controllers_AdminPageController_resume11_route(params) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_AdminPageController_resume11_invoker.call(AdminPageController_5.resume(username))
      }
  
    // @LINE:46
    case controllers_AdminPageController_suspend12_route(params) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_AdminPageController_suspend12_invoker.call(AdminPageController_5.suspend(username))
      }
  }
}
