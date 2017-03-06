
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object errorHandling_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class errorHandling extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*11.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
</head>
<body>
<h1>sorry of inconvenience</h1>
</body>
</html>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object errorHandling extends errorHandling_Scope0.errorHandling
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 04:00:42 IST 2017
                  SOURCE: /home/knoldus/Play/PlayMiniProject/app/views/errorHandling.scala.html
                  HASH: 7053fd001709781bd4062309f8a5e0968ae4121c
                  MATRIX: 543->1|652->15|680->17|775->86|800->91|884->149|898->155|971->207|1049->259|1063->265|1124->306|1208->363|1223->369|1284->408|1332->429|1347->435|1421->488|1505->545|1520->551|1591->601
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12
                  -- GENERATED --
              */
          