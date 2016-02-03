
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
import play.api.data.Form
import play.api.mvc.Flash
import views._
import views.html.helper
import controllers._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.20*/main("Welcome to Play")/*1.43*/ {_display_(Seq[Any](format.raw/*1.45*/("""
  """),format.raw/*2.3*/("""<h1>Welcome</h1>
  <h2>"""),_display_(/*3.8*/message),format.raw/*3.15*/("""</h2>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 09:21:20 EDT 2015
                  SOURCE: /workspace/thesora/app/views/index.scala.html
                  HASH: 1fa3ae60b9262c0e0fe8647c8d05bcae23f71d86
                  MATRIX: 640->1|752->19|783->42|822->44|851->47|900->71|927->78|963->85
                  LINES: 25->1|30->1|30->1|30->1|31->2|32->3|32->3|33->4
                  -- GENERATED --
              */
          