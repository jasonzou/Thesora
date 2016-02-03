
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""<!DOCTYPE html>
<html>
  <head>
    <title>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</title>
    <meta charset="utf-8">
    <meta content="true" name="HandheldFriendly">
    <meta content="initial-scale=1.0 user-scalable=no" name="viewport">
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="Thesora is a (GitHub-Like) Vocabulary Ecosystem for Individuals, Teams and People. It provides an efficient platform and easy to use tools/interfaces for publishing of your own vocabulary (hosting, sharing, collaboration), using other’s data (querying, linking), and making sense of data (analysis, visualization)" name="Description">
    <link rel='stylesheet' href='"""),_display_(/*10.35*/routes/*10.41*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*10.103*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*11.35*/routes/*11.41*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap-theme.min.css"))),format.raw/*11.109*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*12.35*/routes/*12.41*/.WebJarAssets.at(WebJarAssets.locate("font-awesome/4.4.0/css/font-awesome.min.css"))),format.raw/*12.125*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*13.35*/routes/*13.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.82*/("""'>
    <script type='text/javascript' src='"""),_display_(/*14.42*/routes/*14.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*14.102*/("""'></script>
    <script type='text/javascript' src='"""),_display_(/*15.42*/routes/*15.48*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.js"))),format.raw/*15.105*/("""'></script>

    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.66*/("""" type="text/javascript"></script>
  </head>
  <body>
  <header role="banner" id="top" class="navbar navbar-static-top bs-docs-nav">
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="#" class="navbar-brand">Thesora</a>
        </div>
        <div class="navbar-collapse collapse" id="navbar">
          <ul class="nav navbar-nav">
            <li><a href="/"><i class="fa fa-home"></i> Home</a></li>
            <li><a href="/vocs"><i class="fa fa-book"></i> Vocabularies</a></li>
          </ul>
          <div class="nav navbar-nav navbar-right">
            <a class="btn navbar-btn btn-primary" title="Sign In" href="/account/login"><i class="fa fa-chevron-right"></i> Sign In</a> &nbsp; &nbsp;
            <a class="btn navbar-btn btn-success" title="Sign Up" href="/account/register">Sign Up</a>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </nav>
  </header>
  <div class="container">
  """),_display_(/*46.4*/content),format.raw/*46.11*/("""
  """),format.raw/*47.3*/("""</div>
  <div class="debug">
  """),_display_(/*49.4*/debug()),format.raw/*49.11*/("""
  """),format.raw/*50.3*/("""</div>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Sep 14 09:21:20 EDT 2015
                  SOURCE: /workspace/thesora/app/views/main.scala.html
                  HASH: 59e183fbccb3c3ca8b01fd52701cae0d4bacb9f4
                  MATRIX: 643->1|768->31|838->75|863->80|1497->687|1512->693|1596->755|1660->792|1675->798|1765->866|1829->903|1844->909|1950->993|2014->1030|2029->1036|2091->1077|2162->1121|2177->1127|2253->1181|2333->1234|2348->1240|2427->1297|2485->1328|2500->1334|2562->1375|3964->2751|3992->2758|4022->2761|4080->2793|4108->2800|4138->2803
                  LINES: 25->1|30->1|33->4|33->4|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|46->17|46->17|46->17|75->46|75->46|76->47|78->49|78->49|79->50
                  -- GENERATED --
              */
          