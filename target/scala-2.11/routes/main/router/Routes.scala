
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lili/Escritorio/proyecto3/taller2/conf/routes
// @DATE:Sat Sep 03 16:30:23 COT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:25
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:25
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """controllers.Application.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/consultaDePacientes""", """controllers.Application.consultaDePacientes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/consultaDeEpisodios""", """controllers.Application.consultaDeEpisodios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/registrarEpisodio""", """controllers.Application.registrarEpisodio"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/agregarTramite""", """controllers.Application.agregarTramite"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/generarHtmlTramite""", """controllers.Application.generarHtmlTramite(jsonConfTramite:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """episodios""", """controllers.Application.consultarEpisodios(id:Option[Long])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """episodiosPorpaciente""", """controllers.Application.consultarEpisodiosPorPaciente(TipoDocumento:String, NumeroDocumento:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacientes""", """controllers.Application.consultarPacientes(TipoDocumento:Option[String], NumeroDocumento:Option[Long])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agregarEpisodio""", """controllers.Application.agregarEpisodio"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sincronizarEpisodios""", """controllers.Application.sincronizarEpisodios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_login1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val controllers_Application_login1_invoker = createInvoker(
    Application_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """api/login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_consultaDePacientes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/consultaDePacientes")))
  )
  private[this] lazy val controllers_Application_consultaDePacientes2_invoker = createInvoker(
    Application_1.consultaDePacientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "consultaDePacientes",
      Nil,
      "GET",
      """""",
      this.prefix + """api/consultaDePacientes"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_consultaDeEpisodios3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/consultaDeEpisodios")))
  )
  private[this] lazy val controllers_Application_consultaDeEpisodios3_invoker = createInvoker(
    Application_1.consultaDeEpisodios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "consultaDeEpisodios",
      Nil,
      "GET",
      """""",
      this.prefix + """api/consultaDeEpisodios"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_registrarEpisodio4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/registrarEpisodio")))
  )
  private[this] lazy val controllers_Application_registrarEpisodio4_invoker = createInvoker(
    Application_1.registrarEpisodio,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registrarEpisodio",
      Nil,
      "GET",
      """""",
      this.prefix + """api/registrarEpisodio"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_agregarTramite5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/agregarTramite")))
  )
  private[this] lazy val controllers_Application_agregarTramite5_invoker = createInvoker(
    Application_1.agregarTramite,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "agregarTramite",
      Nil,
      "GET",
      """""",
      this.prefix + """api/agregarTramite"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_generarHtmlTramite6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/generarHtmlTramite")))
  )
  private[this] lazy val controllers_Application_generarHtmlTramite6_invoker = createInvoker(
    Application_1.generarHtmlTramite(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "generarHtmlTramite",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/generarHtmlTramite"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_consultarEpisodios7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("episodios")))
  )
  private[this] lazy val controllers_Application_consultarEpisodios7_invoker = createInvoker(
    Application_1.consultarEpisodios(fakeValue[Option[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "consultarEpisodios",
      Seq(classOf[Option[Long]]),
      "GET",
      """""",
      this.prefix + """episodios"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_consultarEpisodiosPorPaciente8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("episodiosPorpaciente")))
  )
  private[this] lazy val controllers_Application_consultarEpisodiosPorPaciente8_invoker = createInvoker(
    Application_1.consultarEpisodiosPorPaciente(fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "consultarEpisodiosPorPaciente",
      Seq(classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """episodiosPorpaciente"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_consultarPacientes9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes")))
  )
  private[this] lazy val controllers_Application_consultarPacientes9_invoker = createInvoker(
    Application_1.consultarPacientes(fakeValue[Option[String]], fakeValue[Option[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "consultarPacientes",
      Seq(classOf[Option[String]], classOf[Option[Long]]),
      "GET",
      """""",
      this.prefix + """pacientes"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_agregarEpisodio10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agregarEpisodio")))
  )
  private[this] lazy val controllers_Application_agregarEpisodio10_invoker = createInvoker(
    Application_1.agregarEpisodio,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "agregarEpisodio",
      Nil,
      "POST",
      """""",
      this.prefix + """agregarEpisodio"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_sincronizarEpisodios11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sincronizarEpisodios")))
  )
  private[this] lazy val controllers_Application_sincronizarEpisodios11_invoker = createInvoker(
    Application_1.sincronizarEpisodios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sincronizarEpisodios",
      Nil,
      "POST",
      """""",
      this.prefix + """sincronizarEpisodios"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:8
    case controllers_Application_login1_route(params) =>
      call { 
        controllers_Application_login1_invoker.call(Application_1.login)
      }
  
    // @LINE:9
    case controllers_Application_consultaDePacientes2_route(params) =>
      call { 
        controllers_Application_consultaDePacientes2_invoker.call(Application_1.consultaDePacientes)
      }
  
    // @LINE:10
    case controllers_Application_consultaDeEpisodios3_route(params) =>
      call { 
        controllers_Application_consultaDeEpisodios3_invoker.call(Application_1.consultaDeEpisodios)
      }
  
    // @LINE:11
    case controllers_Application_registrarEpisodio4_route(params) =>
      call { 
        controllers_Application_registrarEpisodio4_invoker.call(Application_1.registrarEpisodio)
      }
  
    // @LINE:13
    case controllers_Application_agregarTramite5_route(params) =>
      call { 
        controllers_Application_agregarTramite5_invoker.call(Application_1.agregarTramite)
      }
  
    // @LINE:14
    case controllers_Application_generarHtmlTramite6_route(params) =>
      call(params.fromQuery[String]("jsonConfTramite", None)) { (jsonConfTramite) =>
        controllers_Application_generarHtmlTramite6_invoker.call(Application_1.generarHtmlTramite(jsonConfTramite))
      }
  
    // @LINE:16
    case controllers_Application_consultarEpisodios7_route(params) =>
      call(params.fromQuery[Option[Long]]("id", None)) { (id) =>
        controllers_Application_consultarEpisodios7_invoker.call(Application_1.consultarEpisodios(id))
      }
  
    // @LINE:17
    case controllers_Application_consultarEpisodiosPorPaciente8_route(params) =>
      call(params.fromQuery[String]("TipoDocumento", None), params.fromQuery[Long]("NumeroDocumento", None)) { (TipoDocumento, NumeroDocumento) =>
        controllers_Application_consultarEpisodiosPorPaciente8_invoker.call(Application_1.consultarEpisodiosPorPaciente(TipoDocumento, NumeroDocumento))
      }
  
    // @LINE:18
    case controllers_Application_consultarPacientes9_route(params) =>
      call(params.fromQuery[Option[String]]("TipoDocumento", None), params.fromQuery[Option[Long]]("NumeroDocumento", None)) { (TipoDocumento, NumeroDocumento) =>
        controllers_Application_consultarPacientes9_invoker.call(Application_1.consultarPacientes(TipoDocumento, NumeroDocumento))
      }
  
    // @LINE:21
    case controllers_Application_agregarEpisodio10_route(params) =>
      call { 
        controllers_Application_agregarEpisodio10_invoker.call(Application_1.agregarEpisodio)
      }
  
    // @LINE:22
    case controllers_Application_sincronizarEpisodios11_route(params) =>
      call { 
        controllers_Application_sincronizarEpisodios11_invoker.call(Application_1.sincronizarEpisodios)
      }
  
    // @LINE:25
    case controllers_Assets_at12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_0.at(path, file))
      }
  }
}
