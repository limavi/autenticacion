
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lili/Escritorio/proyecto3/taller2/conf/routes
// @DATE:Sat Sep 03 16:30:23 COT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def consultaDeEpisodios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/consultaDeEpisodios")
    }
  
    // @LINE:17
    def consultarEpisodiosPorPaciente(TipoDocumento:String, NumeroDocumento:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "episodiosPorpaciente" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("TipoDocumento", TipoDocumento)), Some(implicitly[QueryStringBindable[Long]].unbind("NumeroDocumento", NumeroDocumento)))))
    }
  
    // @LINE:18
    def consultarPacientes(TipoDocumento:Option[String], NumeroDocumento:Option[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes" + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("TipoDocumento", TipoDocumento)), Some(implicitly[QueryStringBindable[Option[Long]]].unbind("NumeroDocumento", NumeroDocumento)))))
    }
  
    // @LINE:11
    def registrarEpisodio(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/registrarEpisodio")
    }
  
    // @LINE:21
    def agregarEpisodio(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "agregarEpisodio")
    }
  
    // @LINE:13
    def agregarTramite(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/agregarTramite")
    }
  
    // @LINE:16
    def consultarEpisodios(id:Option[Long]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "episodios" + queryString(List(Some(implicitly[QueryStringBindable[Option[Long]]].unbind("id", id)))))
    }
  
    // @LINE:14
    def generarHtmlTramite(jsonConfTramite:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/generarHtmlTramite" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("jsonConfTramite", jsonConfTramite)))))
    }
  
    // @LINE:9
    def consultaDePacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/consultaDePacientes")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
    // @LINE:22
    def sincronizarEpisodios(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sincronizarEpisodios")
    }
  
  }


}
