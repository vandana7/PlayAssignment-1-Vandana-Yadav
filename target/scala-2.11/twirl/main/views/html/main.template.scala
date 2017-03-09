
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*7.58*/("""
    """),format.raw/*8.5*/("""<title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("bootstrapCss/bootstrap.min.css")),format.raw/*10.107*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("images/favicon.png")),format.raw/*11.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*12.114*/("""">
    <!--link rel="stylesheet" media="screen" href=""""),_display_(/*13.53*/routes/*13.59*/.Assets.versioned("stylesheets/external.css")),format.raw/*13.104*/(""""-->


</head>
<body>
"""),format.raw/*19.23*/("""
"""),_display_(/*20.2*/content),format.raw/*20.9*/("""


    """),format.raw/*23.5*/("""</body>
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
                  DATE: Thu Mar 09 13:04:55 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/main.scala.html
                  HASH: 8ffd39d3f2d1344eed54c7baceaeaa117b5e171b
                  MATRIX: 530->2|655->32|683->34|754->131|785->136|819->144|844->149|928->207|942->213|1003->254|1082->306|1097->312|1170->363|1254->420|1269->426|1330->465|1409->517|1424->523|1504->581|1586->636|1601->642|1668->687|1718->790|1746->792|1773->799|1807->806
                  LINES: 20->2|25->2|27->4|30->7|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|41->19|42->20|42->20|45->23
                  -- GENERATED --
              */
          