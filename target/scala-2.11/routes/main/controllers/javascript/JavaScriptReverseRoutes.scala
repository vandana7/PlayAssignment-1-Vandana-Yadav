
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/conf/routes
// @DATE:Thu Mar 09 15:21:18 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def manageAcounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.manageAcounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminpage"})
        }
      """
    )
  
    // @LINE:36
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def signupPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signupPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:20
    def loginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:33
    def profilePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profilePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:17
    def homePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.homePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseLogInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def loginProcess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogInController.loginProcess",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "processinlogin"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseAdminPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def resume: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminPageController.resume",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resume" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
    // @LINE:46
    def suspend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminPageController.suspend",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suspended" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def processData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.processData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "processinsignup"})
        }
      """
    )
  
  }


}
