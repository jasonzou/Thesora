
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catindex_Scope0 {
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

class catindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Cat],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cats: List[Cat]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Cat database")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
  """),format.raw/*4.3*/("""<h2>Insert a kitty cat here:</h2>

  <form action="/insert" method="POST">
    <input name="name" type="text" placeholder="name your feline friend"/>
    <input name="color" type="text" placeholder="enter the color of this kitty cat"/>
    <input type="submit"/>
  </form>

  <h2>Previously inserted cats:</h2>
  <table>
    <tr><th>Name</th><th>Color</th></tr>
    """),_display_(/*15.6*/for(c <- cats) yield /*15.20*/{_display_(Seq[Any](format.raw/*15.21*/(""" 
    """),format.raw/*16.5*/("""<tr><td>"""),_display_(/*16.14*/c/*16.15*/.name),format.raw/*16.20*/("""</td><td>"""),_display_(/*16.30*/c/*16.31*/.color),format.raw/*16.37*/("""</td></tr>
    """)))}),format.raw/*17.6*/("""
  """),format.raw/*18.3*/("""</table>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(cats:List[Cat]): play.twirl.api.HtmlFormat.Appendable = apply(cats)

  def f:((List[Cat]) => play.twirl.api.HtmlFormat.Appendable) = (cats) => apply(cats)

  def ref: this.type = this

}


}

/**/
object catindex extends catindex_Scope0.catindex
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 11:07:30 EDT 2015
                  SOURCE: /workspace/thesora/app/views/catindex.scala.html
                  HASH: 0e9e08ddc63adb55c270f04be7a0191da92a83a9
                  MATRIX: 649->1|761->18|789->21|817->41|856->43|885->46|1278->413|1308->427|1347->428|1380->434|1416->443|1426->444|1452->449|1489->459|1499->460|1526->466|1572->482|1602->485|1642->495
                  LINES: 25->1|30->1|32->3|32->3|32->3|33->4|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|47->18|48->19
                  -- GENERATED --
              */
          