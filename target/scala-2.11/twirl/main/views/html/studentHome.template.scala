
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object studentHome_Scope0 {
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

class studentHome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html lang="en">
<head>
<title>ITeach</title>
"""),_display_(/*6.2*/requiredAssetsCSS()),format.raw/*6.21*/("""
"""),format.raw/*7.1*/("""</head>
<body>
	"""),_display_(/*9.3*/header()),format.raw/*9.11*/("""
"""),format.raw/*10.1*/("""</body>
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
object studentHome extends studentHome_Scope0.studentHome
              /*
                  -- GENERATED --
                  DATE: Tue Nov 17 06:58:54 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/studentHome.scala.html
                  HASH: c0d3bd92bb1a080fb69e986443bbf5dc4ac5f69a
                  MATRIX: 839->0|928->64|967->83|994->84|1036->101|1064->109|1092->110
                  LINES: 32->1|37->6|37->6|38->7|40->9|40->9|41->10
                  -- GENERATED --
              */
          