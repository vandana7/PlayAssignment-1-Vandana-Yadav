
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/PlayMiniProject/conf/routes
// @DATE:Tue Mar 07 02:30:43 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:8
  CountController_2: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:26
  SignUpController_1: controllers.SignUpController,
  // @LINE:29
  LogInController_0: controllers.LogInController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:8
    CountController_2: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:26
    SignUpController_1: controllers.SignUpController,
    // @LINE:29
    LogInController_0: controllers.LogInController
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_4, Assets_5, SignUpController_1, LogInController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_4, Assets_5, SignUpController_1, LogInController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.homePage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signupPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processinsignup""", """controllers.SignUpController.processData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processinlogin""", """controllers.LogInController.loginProcess"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profilePage"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
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
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
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
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_HomeController_homePage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_homePage4_invoker = createInvoker(
    HomeController_3.homePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "homePage",
      Nil,
      "GET",
      """ for home page""",
      this.prefix + """home"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_loginPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginPage5_invoker = createInvoker(
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
  private[this] lazy val controllers_HomeController_signupPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signupPage6_invoker = createInvoker(
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
  private[this] lazy val controllers_SignUpController_processData7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processinsignup")))
  )
  private[this] lazy val controllers_SignUpController_processData7_invoker = createInvoker(
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
  private[this] lazy val controllers_LogInController_loginProcess8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processinlogin")))
  )
  private[this] lazy val controllers_LogInController_loginProcess8_invoker = createInvoker(
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
  private[this] lazy val controllers_HomeController_profilePage9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profilePage9_invoker = createInvoker(
    HomeController_3.profilePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profilePage",
      Nil,
      "POST",
      """for profile page from sign up page""",
      this.prefix + """profile"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_2.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_homePage4_route(params) =>
      call { 
        controllers_HomeController_homePage4_invoker.call(HomeController_3.homePage)
      }
  
    // @LINE:20
    case controllers_HomeController_loginPage5_route(params) =>
      call { 
        controllers_HomeController_loginPage5_invoker.call(HomeController_3.loginPage)
      }
  
    // @LINE:23
    case controllers_HomeController_signupPage6_route(params) =>
      call { 
        controllers_HomeController_signupPage6_invoker.call(HomeController_3.signupPage)
      }
  
    // @LINE:26
    case controllers_SignUpController_processData7_route(params) =>
      call { 
        controllers_SignUpController_processData7_invoker.call(SignUpController_1.processData)
      }
  
    // @LINE:29
    case controllers_LogInController_loginProcess8_route(params) =>
      call { 
        controllers_LogInController_loginProcess8_invoker.call(LogInController_0.loginProcess)
      }
  
    // @LINE:33
    case controllers_HomeController_profilePage9_route(params) =>
      call { 
        controllers_HomeController_profilePage9_invoker.call(HomeController_3.profilePage)
      }
  }
}
