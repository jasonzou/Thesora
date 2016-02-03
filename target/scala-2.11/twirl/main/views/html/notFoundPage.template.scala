
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notFoundPage_Scope0 {
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

class notFoundPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.27*/main("Not Found")/*1.44*/ {_display_(Seq[Any](format.raw/*1.46*/("""
    """),format.raw/*2.5*/("""<h1>Not Found</h1>
    <p>You requested: """),_display_(/*3.24*/request/*3.31*/.path),format.raw/*3.36*/("""</p>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object notFoundPage extends notFoundPage_Scope0.notFoundPage
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 09:21:20 EDT 2015
                  SOURCE: /workspace/thesora/app/views/notFoundPage.scala.html
                  HASH: 92e4d262141603c65df99f502367921fbaa4dced
                  MATRIX: 661->1|780->26|805->43|844->45|875->50|943->92|958->99|983->104|1018->110
                  LINES: 25->1|30->1|30->1|30->1|31->2|32->3|32->3|32->3|33->4
                  -- GENERATED --
              */
          