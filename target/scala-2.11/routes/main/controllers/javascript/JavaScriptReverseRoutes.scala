
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lili/Escritorio/proyecto3/taller2/conf/routes
// @DATE:Sat Sep 03 16:30:23 COT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def consultaDeEpisodios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.consultaDeEpisodios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/consultaDeEpisodios"})
        }
      """
    )
  
    // @LINE:17
    def consultarEpisodiosPorPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.consultarEpisodiosPorPaciente",
      """
        function(TipoDocumento0,NumeroDocumento1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "episodiosPorpaciente" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("TipoDocumento", TipoDocumento0), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("NumeroDocumento", NumeroDocumento1)])})
        }
      """
    )
  
    // @LINE:18
    def consultarPacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.consultarPacientes",
      """
        function(TipoDocumento0,NumeroDocumento1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacientes" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("TipoDocumento", TipoDocumento0), (""" + implicitly[QueryStringBindable[Option[Long]]].javascriptUnbind + """)("NumeroDocumento", NumeroDocumento1)])})
        }
      """
    )
  
    // @LINE:11
    def registrarEpisodio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.registrarEpisodio",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/registrarEpisodio"})
        }
      """
    )
  
    // @LINE:21
    def agregarEpisodio: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.agregarEpisodio",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "agregarEpisodio"})
        }
      """
    )
  
    // @LINE:13
    def agregarTramite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.agregarTramite",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/agregarTramite"})
        }
      """
    )
  
    // @LINE:16
    def consultarEpisodios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.consultarEpisodios",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "episodios" + _qS([(""" + implicitly[QueryStringBindable[Option[Long]]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:14
    def generarHtmlTramite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.generarHtmlTramite",
      """
        function(jsonConfTramite0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/generarHtmlTramite" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("jsonConfTramite", jsonConfTramite0)])})
        }
      """
    )
  
    // @LINE:9
    def consultaDePacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.consultaDePacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/consultaDePacientes"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
    // @LINE:22
    def sincronizarEpisodios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sincronizarEpisodios",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sincronizarEpisodios"})
        }
      """
    )
  
  }


}
