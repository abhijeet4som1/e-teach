
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Abhijeet/work/project/I-Teach/conf/routes
// @DATE:Tue Nov 17 06:46:55 IST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package com.iteach.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def processLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.LoginController.processLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:9
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.LoginController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:13
    def activate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.LoginController.activate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activate"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def studentZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.Application.studentZone",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentZone"})
        }
      """
    )
  
    // @LINE:8
    def tutorZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.Application.tutorZone",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorZone"})
        }
      """
    )
  
    // @LINE:12
    def tutorHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.Application.tutorHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorHome"})
        }
      """
    )
  
    // @LINE:11
    def studentHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.Application.studentHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentHome"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.iteach.controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}