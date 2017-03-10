
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*7.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("bootstrap/js/jQuery-3.1.1.min.js")),format.raw/*10.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*11.79*/("""" type="text/javascript"></script>
</head>
<body>
<form class="form-horizontal" action=""""),_display_(/*14.40*/routes/*14.46*/.SignUpController.processData),format.raw/*14.75*/("""" method="POST">
    <div class="form-group">
        <label class="control-label col-sm-2" for="firstname">First Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstname" placeholder="Enter firstName" name="firstname" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="middlename">Middle Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="middlename" placeholder="Enter middleName" name="middlename">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="lastname">Last Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="lastname" placeholder="Enter lastName" name="lastname" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="username">User Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" placeholder="Enter userName" name="username" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Password:</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
        </div>
    </div>

    <div class="form-group">
        <label class="control-label col-sm-2" for="repwd">Re-Enter Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="repwd" placeholder="Enter password" name="repwd" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="mobileNo">Mobile No</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="mobileNo" placeholder="Enter password" name="mobileNo" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="pwd">Gender</label>
        <div class="col-sm-10">
            <select name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="age">Age</label>
        <div class="col-sm-10">
            <input type="number" class="form-control" id="age" placeholder="Enter password" name="age" required>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" for="hobbies">Hobbies</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="hobbies" placeholder="Enter password" name="hobbies" required>
        </div>
    </div>
    <div class="form-group">

            <input type="hidden"  name="isAdmin"

              """),_display_(/*83.16*/if(play.Play.application().configuration().getString("logintype")=="Admin" )/*83.92*/{_display_(Seq[Any](format.raw/*83.93*/("""

                """),format.raw/*85.17*/("""value=true
                 """)))}),format.raw/*86.19*/("""
                """),format.raw/*87.17*/("""else"""),format.raw/*87.21*/("""{"""),format.raw/*87.22*/("""
                """),format.raw/*88.17*/("""value=false
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""">

    </div>
    <div class="form-group">

        <input type="hidden"  name="isAllowed"

               """),_display_(/*96.17*/if(play.Play.application().configuration().getString("permission")=="allowed" )/*96.96*/{_display_(Seq[Any](format.raw/*96.97*/("""

        """),format.raw/*98.9*/("""value=true
        """)))}),format.raw/*99.10*/("""
        """),format.raw/*100.9*/("""else"""),format.raw/*100.13*/("""{"""),format.raw/*100.14*/("""
        """),format.raw/*101.9*/("""value=false
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/(""">

    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Sign Up</button>
        </div>
    </div>
</form>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 05:36:31 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/signup.scala.html
                  HASH: f37cf0a249dd28c1d7060bb19f79fe6542ae7085
                  MATRIX: 529->1|638->15|665->16|760->85|785->90|869->148|883->154|956->206|1034->258|1048->264|1109->305|1192->362|1206->368|1266->407|1314->428|1329->434|1403->487|1487->544|1502->550|1573->600|1689->689|1704->695|1754->724|4774->3717|4859->3793|4898->3794|4944->3812|5004->3841|5049->3858|5081->3862|5110->3863|5155->3880|5211->3908|5240->3909|5375->4017|5463->4096|5502->4097|5539->4107|5590->4127|5627->4136|5660->4140|5690->4141|5727->4150|5775->4170|5805->4171
                  LINES: 20->1|25->1|26->2|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|38->14|107->83|107->83|107->83|109->85|110->86|111->87|111->87|111->87|112->88|113->89|113->89|120->96|120->96|120->96|122->98|123->99|124->100|124->100|124->100|125->101|126->102|126->102
                  -- GENERATED --
              */
          