
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object debug_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import play.api.data.Form
import play.api.mvc.Flash
import views._
import views.html.helper
import controllers._

class debug extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current

Seq[Any](format.raw/*1.4*/(""" """),format.raw/*1.5*/("""(implicit lang:Lang)
"""),format.raw/*3.1*/("""<footer>
  user = """),_display_(/*4.11*/current/*4.18*/.configuration.getString("application.version")),format.raw/*4.65*/(""",
  date = """),_display_(/*5.11*/(new java.util.Date())),format.raw/*5.33*/("""
"""),format.raw/*6.1*/("""</footer>
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
object debug extends debug_Scope0.debug
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 09:21:20 EDT 2015
                  SOURCE: /workspace/thesora/app/views/debug.scala.html
                  HASH: 64d4b50e2074cc9a25e510233d780c56ec3b8156
                  MATRIX: 633->1|757->3|784->4|831->55|876->74|891->81|958->128|996->140|1038->162|1065->163
                  LINES: 25->1|30->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|34->6
                  -- GENERATED --
              */
          