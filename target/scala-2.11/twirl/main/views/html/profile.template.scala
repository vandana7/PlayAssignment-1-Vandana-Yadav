
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data:model.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*7.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*10.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*11.79*/("""" type="text/javascript"></script>
</head>
<body>
"""),_display_(/*14.2*/main("profile")/*14.17*/{_display_(Seq[Any](format.raw/*14.18*/("""
"""),format.raw/*15.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li><a href=""""),_display_(/*18.27*/routes/*18.33*/.ProfileController.logout),format.raw/*18.58*/(""""><i class="fa fa-power-off" aria-hidden="true"></i>
                <span style="margin-left:10px;font-size:15px;">Logout</span>
            </a>
            </li>
        </ul>
    </div>
</nav>


<div class="row" style="margin-top:20px;">
    <div class="col-md-3" ></div>
    <div class="col-md-6 info underline" >Name:"""),_display_(/*29.49*/data/*29.53*/.firstname),format.raw/*29.63*/(""" """),_display_(/*29.65*/data/*29.69*/.middlename),format.raw/*29.80*/(""" """),_display_(/*29.82*/data/*29.86*/.lastname),format.raw/*29.95*/(""" """),format.raw/*29.96*/("""</div>
    <div class="col-md-3" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >UserName:"""),_display_(/*35.47*/data/*35.51*/.username),format.raw/*35.60*/("""</div>
    <div class="col-md-4" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Gender:"""),_display_(/*41.45*/data/*41.49*/.gender),format.raw/*41.56*/(""" """),format.raw/*41.57*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Age:"""),_display_(/*46.42*/data/*46.46*/.age),format.raw/*46.50*/(""" """),format.raw/*46.51*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Hobbies:"""),_display_(/*51.46*/data/*51.50*/.hobbies),format.raw/*51.58*/("""</div>
    <div class="col-md-4" ></div>
</div>
""")))}),format.raw/*54.2*/("""
"""),format.raw/*55.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(data:model.Users): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((model.Users) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 09:17:51 IST 2017
                  SOURCE: /home/knoldus/Play/PlayMiniProject/app/views/profile.scala.html
                  HASH: 62baf57bb24318aa130b8ad6eba6784768ad1a50
                  MATRIX: 536->1|649->19|676->20|835->153|849->159|922->211|1000->263|1014->269|1075->310|1158->367|1172->373|1232->412|1280->433|1295->439|1369->492|1453->549|1468->555|1539->605|1616->656|1640->671|1679->672|1707->673|1866->805|1881->811|1927->836|2278->1160|2291->1164|2322->1174|2351->1176|2364->1180|2396->1191|2425->1193|2438->1197|2468->1206|2497->1207|2696->1379|2709->1383|2739->1392|2936->1562|2949->1566|2977->1573|3006->1574|3199->1740|3212->1744|3237->1748|3266->1749|3463->1919|3476->1923|3505->1931|3584->1980|3612->1981
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|38->14|39->15|42->18|42->18|42->18|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|59->35|59->35|59->35|65->41|65->41|65->41|65->41|70->46|70->46|70->46|70->46|75->51|75->51|75->51|78->54|79->55
                  -- GENERATED --
              */
          