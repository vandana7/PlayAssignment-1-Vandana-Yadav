
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homePage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class homePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*5.58*/("""
    """),format.raw/*6.5*/("""<title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*7.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*10.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*11.79*/("""" type="text/javascript"></script>
</head>
<body background=""""),_display_(/*13.20*/routes/*13.26*/.Assets.versioned("images/img1.jpg")),format.raw/*13.62*/("""">
"""),format.raw/*15.23*/("""
"""),format.raw/*16.1*/("""<div class="container-fluid text-center" style="z-index:999;">
    <h1>hello this is our home page </h1>
    <img src=""""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("images/img4.jpg")),format.raw/*18.58*/("""" class="img-responsive ">

    <a href=""""),_display_(/*20.15*/routes/*20.21*/.HomeController.loginPage),format.raw/*20.46*/("""" ><button type="button" class="btn btn-primary" >Log In</button></a>
    <a href=""""),_display_(/*21.15*/routes/*21.21*/.HomeController.signupPage),format.raw/*21.47*/("""" ><button type="button" class="btn btn-primary">Sign UP</button></a>


</div>
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
object homePage extends homePage_Scope0.homePage
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 05:36:31 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/homePage.scala.html
                  HASH: 80a63cc7b81c0803a65999791d7aec5907874146
                  MATRIX: 533->1|642->15|669->16|740->113|771->118|805->126|830->131|914->189|928->195|1001->247|1079->299|1093->305|1154->346|1237->403|1251->409|1311->448|1359->469|1374->475|1448->528|1532->585|1547->591|1618->641|1707->703|1722->709|1779->745|1810->829|1838->830|1985->950|2000->956|2057->992|2126->1034|2141->1040|2187->1065|2298->1149|2313->1155|2360->1181
                  LINES: 20->1|25->1|26->2|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13|37->13|38->15|39->16|41->18|41->18|41->18|43->20|43->20|43->20|44->21|44->21|44->21
                  -- GENERATED --
              */
          