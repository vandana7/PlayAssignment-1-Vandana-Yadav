
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""


"""),_display_(/*8.2*/main("PlayMiniProject")/*8.25*/{_display_(Seq[Any](format.raw/*8.26*/("""




""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Mar 10 05:36:31 IST 2017
                  SOURCE: /home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/app/views/index.scala.html
                  HASH: c7ae239e92f882b73fe8b7720d1cbaf53e6adb37
                  MATRIX: 616->95|728->112|757->116|788->139|826->140
                  LINES: 23->5|28->5|31->8|31->8|31->8
                  -- GENERATED --
              */
          