
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manageProfile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object manageProfile_Scope1 {
import model.Users

class manageProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(data:List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.20*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*8.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("images/favicon.png")),format.raw/*10.100*/("""">
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*11.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
</head>
<body>
"""),_display_(/*15.2*/main("AdminPage")/*15.19*/{_display_(Seq[Any](format.raw/*15.20*/("""
"""),format.raw/*16.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li><a href=""""),_display_(/*19.27*/routes/*19.33*/.ProfileController.logout),format.raw/*19.58*/(""""><i class="fa fa-power-off" aria-hidden="true"></i>
                <span style="margin-left:10px;font-size:15px;">Logout</span>
            </a>
            </li>

        </ul>
    </div>
</nav>

<ul>
"""),_display_(/*29.2*/for(info <- data) yield /*29.19*/{_display_(Seq[Any](format.raw/*29.20*/("""


    """),format.raw/*32.5*/("""<li>
<div class="row" style="margin-top:20px;">

    <div class="col-md-4 restInfo" >UserName:"""),_display_(/*35.47*/info/*35.51*/.username),format.raw/*35.60*/("""</div>
    <div class="col-md-4 restInfo" >Password:"""),_display_(/*36.47*/info/*36.51*/.pwd),format.raw/*36.55*/("""</div>
    <div class="col-md-2" >
        <a href=""""),_display_(/*38.19*/routes/*38.25*/.AdminPageController.resume(info.username)),format.raw/*38.67*/("""" ><button>Resume</button></a>
    </div>
    <div class="col-md-2" >
        <a href=""""),_display_(/*41.19*/routes/*41.25*/.AdminPageController.suspend(info.username)),format.raw/*41.68*/(""""><button>Suspend</button></a>
    </div>
</div>

</li>

""")))}),format.raw/*47.2*/("""
"""),format.raw/*48.1*/("""</ul>

""")))}),format.raw/*50.2*/("""
"""),format.raw/*51.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(data:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


}
}

/**/
object manageProfile extends manageProfile_Scope0.manageProfile_Scope1.manageProfile
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 05:36:31 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/manageProfile.scala.html
                  HASH: 660018cf2c14bdef4b9693cca640f4c619d6e7c2
                  MATRIX: 603->21|716->39|743->40|902->173|916->179|989->231|1067->283|1081->289|1142->330|1226->387|1241->393|1302->432|1350->453|1365->459|1439->512|1523->569|1538->575|1609->625|1686->676|1712->693|1751->694|1779->695|1938->827|1953->833|1999->858|2230->1063|2263->1080|2302->1081|2336->1088|2458->1183|2471->1187|2501->1196|2581->1249|2594->1253|2619->1257|2699->1310|2714->1316|2777->1358|2892->1446|2907->1452|2971->1495|3059->1553|3087->1554|3125->1562|3153->1563
                  LINES: 23->2|28->2|29->3|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|41->15|41->15|41->15|42->16|45->19|45->19|45->19|55->29|55->29|55->29|58->32|61->35|61->35|61->35|62->36|62->36|62->36|64->38|64->38|64->38|67->41|67->41|67->41|73->47|74->48|76->50|77->51
                  -- GENERATED --
              */
          