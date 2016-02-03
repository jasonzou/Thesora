
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object errorPage_Scope0 {
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

class errorPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(throwable: Throwable):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.25*/main("Error Page")/*1.43*/ {_display_(Seq[Any](format.raw/*1.45*/("""
    """),format.raw/*2.5*/("""<h1>Error Happened</h1>
    <p>"""),_display_(/*3.9*/throwable/*3.18*/.getMessage),format.raw/*3.29*/("""</p>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(throwable:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(throwable)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (throwable) => apply(throwable)

  def ref: this.type = this

}


}

/**/
object errorPage extends errorPage_Scope0.errorPage
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 09:21:20 EDT 2015
                  SOURCE: /workspace/thesora/app/views/errorPage.scala.html
                  HASH: 16de46260ebc11663207ecfd9b0422161f52c404
                  MATRIX: 651->1|768->24|794->42|833->44|864->49|921->81|938->90|969->101|1004->107
                  LINES: 25->1|30->1|30->1|30->1|31->2|32->3|32->3|32->3|33->4
                  -- GENERATED --
              */
          