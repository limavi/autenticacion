
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html ng-app="app">
  <head>
    <title>Trámites en linea</title>
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png")),format.raw/*7.93*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.at("stylesheets/app.css")),format.raw/*8.89*/("""">
  </head>
  <body ng-controller="HomeCtrl as ctrl">

    <div ng-hide="authenticated">
      <form ng-submit="ctrl.login()">
        <input type="text"     placeholder="User_name" ng-model="ctrl.loginForm.username">
        <input type="password" placeholder="Password" ng-model="ctrl.loginForm.password">
        <button class="btn btn-login" type="submit">Login</button>
      </form>
    </div>

    <div ng-show="authenticated">
      <div class="navbar-header">
        <button type="button" class="btn-logout" ng-click="logout()">Logout</button>
        <h3>Nombre de usuario: """),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""{"""),format.raw/*23.34*/("""user().name"""),format.raw/*23.45*/("""}"""),format.raw/*23.46*/("""}"""),format.raw/*23.47*/(""" """),format.raw/*23.48*/("""Rol: """),format.raw/*23.53*/("""{"""),format.raw/*23.54*/("""{"""),format.raw/*23.55*/("""user().role"""),format.raw/*23.66*/("""}"""),format.raw/*23.67*/("""}"""),format.raw/*23.68*/(""" """),format.raw/*23.69*/("""</h3>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <div style="width:30%">
          <ul class="nav navbar-nav navbar-right">
            <div><button type="button" ng-click="ctrl.rutaInclude='/api/consultaDePacientes';">Consultar Paciente</button></div>
            <div><button type="button" ng-click="ctrl.rutaInclude='/api/consultaDeEpisodios';">Consultar Episodio</button></div>
            <div><button type="button" ng-click="ctrl.rutaInclude='/api/registrarEpisodio';"  >Registrar Episodio</button></div>
            <div><button type="button" ng-click="ctrl.rutaInclude='/api/agregarTramite';"  >Agregar Trámite</button></div>
          </ul>
        </div>
        <div ng-include=ctrl.rutaInclude></div>
      </div>
    </div>

    <section ng-if="notification" class="fade-if" ng-click="closeNotification()">
      <div class="notification" ng-class="'' + notification.severity">
        """),format.raw/*40.9*/("""{"""),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""notification.message"""),format.raw/*40.31*/("""}"""),format.raw/*40.32*/("""}"""),format.raw/*40.33*/("""
      """),format.raw/*41.7*/("""</div>
    </section>

    <script src="//rawgit.com/pauldijou/jwt-client/master/jwt-client.js" type="text/javascript"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular-animate.js"></script>
    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.at("javascripts/app.js")),format.raw/*47.57*/("""" type="text/javascript"></script>

    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-sanitize.js"></script>

  </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 16:30:23 COT 2016
                  SOURCE: /home/lili/Escritorio/proyecto3/taller2/app/views/index.scala.html
                  HASH: e68a1324b62dc98ee041acb3a122c10f548b965a
                  MATRIX: 525->1|635->16|662->17|825->154|839->160|891->192|969->244|983->250|1036->283|1650->869|1679->870|1708->871|1747->882|1776->883|1805->884|1834->885|1867->890|1896->891|1925->892|1964->903|1993->904|2022->905|2051->906|3012->1840|3041->1841|3070->1842|3118->1862|3147->1863|3176->1864|3210->1871|3566->2200|3581->2206|3634->2238
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|32->8|32->8|32->8|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|47->23|64->40|64->40|64->40|64->40|64->40|64->40|65->41|71->47|71->47|71->47
                  -- GENERATED --
              */
          