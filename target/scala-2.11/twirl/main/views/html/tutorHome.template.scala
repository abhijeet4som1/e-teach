
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tutorHome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class tutorHome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html>
<body>
Tutor page
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object tutorHome extends tutorHome_Scope0.tutorHome
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 06:08:05 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/tutorHome.scala.html
                  HASH: 50b916c7689ce64ea809179177a6f17dd1503e96
                  MATRIX: 835->0
                  LINES: 32->1
                  -- GENERATED --
              */
          