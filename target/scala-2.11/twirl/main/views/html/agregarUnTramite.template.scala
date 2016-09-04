
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object agregarUnTramite_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class agregarUnTramite extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<center>
    <h1>Agregar Tramite</h1>
    <form name="crearTramite" novalidate ng-submit="ctrl.PreVisualizarTramite(ctrl.jsonTramite)" >
    <label>Json del Trámite</label> <br/>
    <textarea ng-model="ctrl.jsonTramite" cols="40" rows="10"></textarea>
    <br>
    <button type="submit">Pre-visualizar</button>
    <button type="button" ng-click="ctrl.cancelarCreacionTramite()">Cancelar</button>
    </form>

    <p ng-bind-html="ctrl.paginaDelTramite"></p>

</center>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object agregarUnTramite extends agregarUnTramite_Scope0.agregarUnTramite
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 16:30:23 COT 2016
                  SOURCE: /home/lili/Escritorio/proyecto3/taller2/app/views/agregarUnTramite.scala.html
                  HASH: 0592a122ccf30419a8e1c5514359422df5652ab2
                  MATRIX: 542->1|638->3|665->4
                  LINES: 20->1|25->1|26->2
                  -- GENERATED --
              */
          