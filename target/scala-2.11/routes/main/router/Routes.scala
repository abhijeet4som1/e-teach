
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Abhijeet/work/project/I-Teach/conf/routes
// @DATE:Tue Nov 17 06:46:55 IST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: com.iteach.controllers.Application,
  // @LINE:9
  LoginController_0: com.iteach.controllers.LoginController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: com.iteach.controllers.Application,
    // @LINE:9
    LoginController_0: com.iteach.controllers.LoginController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, LoginController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, LoginController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """com.iteach.controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentZone""", """com.iteach.controllers.Application.studentZone()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorZone""", """com.iteach.controllers.Application.tutorZone()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """com.iteach.controllers.LoginController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """com.iteach.controllers.LoginController.processLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentHome""", """com.iteach.controllers.Application.studentHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorHome""", """com.iteach.controllers.Application.tutorHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activate""", """com.iteach.controllers.LoginController.activate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val com_iteach_controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val com_iteach_controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val com_iteach_controllers_Application_studentZone1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentZone")))
  )
  private[this] lazy val com_iteach_controllers_Application_studentZone1_invoker = createInvoker(
    Application_2.studentZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.Application",
      "studentZone",
      Nil,
      "GET",
      """""",
      this.prefix + """studentZone"""
    )
  )

  // @LINE:8
  private[this] lazy val com_iteach_controllers_Application_tutorZone2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorZone")))
  )
  private[this] lazy val com_iteach_controllers_Application_tutorZone2_invoker = createInvoker(
    Application_2.tutorZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.Application",
      "tutorZone",
      Nil,
      "GET",
      """""",
      this.prefix + """tutorZone"""
    )
  )

  // @LINE:9
  private[this] lazy val com_iteach_controllers_LoginController_register3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val com_iteach_controllers_LoginController_register3_invoker = createInvoker(
    LoginController_0.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.LoginController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:10
  private[this] lazy val com_iteach_controllers_LoginController_processLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val com_iteach_controllers_LoginController_processLogin4_invoker = createInvoker(
    LoginController_0.processLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.LoginController",
      "processLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val com_iteach_controllers_Application_studentHome5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentHome")))
  )
  private[this] lazy val com_iteach_controllers_Application_studentHome5_invoker = createInvoker(
    Application_2.studentHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.Application",
      "studentHome",
      Nil,
      "GET",
      """""",
      this.prefix + """studentHome"""
    )
  )

  // @LINE:12
  private[this] lazy val com_iteach_controllers_Application_tutorHome6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorHome")))
  )
  private[this] lazy val com_iteach_controllers_Application_tutorHome6_invoker = createInvoker(
    Application_2.tutorHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.Application",
      "tutorHome",
      Nil,
      "GET",
      """""",
      this.prefix + """tutorHome"""
    )
  )

  // @LINE:13
  private[this] lazy val com_iteach_controllers_LoginController_activate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activate")))
  )
  private[this] lazy val com_iteach_controllers_LoginController_activate7_invoker = createInvoker(
    LoginController_0.activate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.iteach.controllers.LoginController",
      "activate",
      Nil,
      "GET",
      """""",
      this.prefix + """activate"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case com_iteach_controllers_Application_index0_route(params) =>
      call { 
        com_iteach_controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:7
    case com_iteach_controllers_Application_studentZone1_route(params) =>
      call { 
        com_iteach_controllers_Application_studentZone1_invoker.call(Application_2.studentZone())
      }
  
    // @LINE:8
    case com_iteach_controllers_Application_tutorZone2_route(params) =>
      call { 
        com_iteach_controllers_Application_tutorZone2_invoker.call(Application_2.tutorZone())
      }
  
    // @LINE:9
    case com_iteach_controllers_LoginController_register3_route(params) =>
      call { 
        com_iteach_controllers_LoginController_register3_invoker.call(LoginController_0.register())
      }
  
    // @LINE:10
    case com_iteach_controllers_LoginController_processLogin4_route(params) =>
      call { 
        com_iteach_controllers_LoginController_processLogin4_invoker.call(LoginController_0.processLogin())
      }
  
    // @LINE:11
    case com_iteach_controllers_Application_studentHome5_route(params) =>
      call { 
        com_iteach_controllers_Application_studentHome5_invoker.call(Application_2.studentHome())
      }
  
    // @LINE:12
    case com_iteach_controllers_Application_tutorHome6_route(params) =>
      call { 
        com_iteach_controllers_Application_tutorHome6_invoker.call(Application_2.tutorHome())
      }
  
    // @LINE:13
    case com_iteach_controllers_LoginController_activate7_route(params) =>
      call { 
        com_iteach_controllers_LoginController_activate7_invoker.call(LoginController_0.activate())
      }
  
    // @LINE:16
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}