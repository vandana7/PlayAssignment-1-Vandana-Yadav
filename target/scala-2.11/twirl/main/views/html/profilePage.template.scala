
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profilePage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profilePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[model.Users,play.twirl.api.HtmlFormat.Appendable] {

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
            <li><a href=""""),_display_(/*18.27*/routes/*18.33*/.ProfileController.logout()),format.raw/*18.60*/(""""><i class="fa fa-power-off" aria-hidden="true"></i>
                <span style="margin-left:10px;font-size:15px;">Logout</span>
            </a>
            </li>
            """),_display_(/*22.14*/if(data.isAdmin== true)/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/("""

            """),format.raw/*24.13*/("""<li><a href=""""),_display_(/*24.27*/routes/*24.33*/.ProfileController.manageAcounts()),format.raw/*24.67*/(""""><i class="fa fa-power-off" aria-hidden="true"></i>
                <span style="margin-left:10px;font-size:15px;">Manage Accounts</span>
            </a>
            </li>
            """)))}),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""</ul>
    </div>
</nav>


<div class="row" style="margin-top:20px;">
    <div class="col-md-3" ></div>
    <div class="col-md-6 info underline" >Name:"""),_display_(/*36.49*/data/*36.53*/.firstname),format.raw/*36.63*/(""" """),_display_(/*36.65*/data/*36.69*/.middlename),format.raw/*36.80*/(""" """),_display_(/*36.82*/data/*36.86*/.lastname),format.raw/*36.95*/(""" """),format.raw/*36.96*/("""</div>
    <div class="col-md-3" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >UserName:"""),_display_(/*42.47*/data/*42.51*/.username),format.raw/*42.60*/("""</div>
    <div class="col-md-4" ></div>
</div>

<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Gender:"""),_display_(/*48.45*/data/*48.49*/.gender),format.raw/*48.56*/(""" """),format.raw/*48.57*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Age:"""),_display_(/*53.42*/data/*53.46*/.age),format.raw/*53.50*/(""" """),format.raw/*53.51*/("""</div>
    <div class="col-md-4" ></div>
</div>
<div class="row" style="margin-top:20px;">
    <div class="col-md-4" ></div>
    <div class="col-md-4 restInfo" >Hobbies:"""),_display_(/*58.46*/data/*58.50*/.hobbies),format.raw/*58.58*/("""</div>
    <div class="col-md-4" ></div>
</div>
""")))}),format.raw/*61.2*/("""
"""),format.raw/*62.1*/("""</body>
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
object profilePage extends profilePage_Scope0.profilePage
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 05:36:31 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/profilePage.scala.html
                  HASH: 9299f71cf8794528055679929d762e6d3a618cb6
                  MATRIX: 544->1|657->19|684->20|843->153|857->159|930->211|1008->263|1022->269|1083->310|1166->367|1180->373|1240->412|1288->433|1303->439|1377->492|1461->549|1476->555|1547->605|1624->656|1648->671|1687->672|1715->673|1874->805|1889->811|1937->838|2142->1016|2174->1039|2213->1040|2255->1054|2296->1068|2311->1074|2366->1108|2584->1295|2620->1304|2798->1455|2811->1459|2842->1469|2871->1471|2884->1475|2916->1486|2945->1488|2958->1492|2988->1501|3017->1502|3216->1674|3229->1678|3259->1687|3456->1857|3469->1861|3497->1868|3526->1869|3719->2035|3732->2039|3757->2043|3786->2044|3983->2214|3996->2218|4025->2226|4104->2275|4132->2276
                  LINES: 20->1|25->1|26->2|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|38->14|39->15|42->18|42->18|42->18|46->22|46->22|46->22|48->24|48->24|48->24|48->24|52->28|53->29|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|66->42|66->42|66->42|72->48|72->48|72->48|72->48|77->53|77->53|77->53|77->53|82->58|82->58|82->58|85->61|86->62
                  -- GENERATED --
              */
          