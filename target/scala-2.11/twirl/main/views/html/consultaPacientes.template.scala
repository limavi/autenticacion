
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consultaPacientes_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class consultaPacientes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<h1>pacientes</h1>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object consultaPacientes extends consultaPacientes_Scope0.consultaPacientes
              /*
                  -- GENERATED --
                  DATE: Sat Sep 03 16:30:23 COT 2016
                  SOURCE: /home/lili/Escritorio/proyecto3/taller2/app/views/consultaPacientes.scala.html
                  HASH: d7d0df09daddb5d6c942370ae045d8b8d83f0b28
                  MATRIX: 544->1|640->3|667->4
                  LINES: 20->1|25->1|26->2
                  -- GENERATED --
              */
          