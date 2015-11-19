
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object studentPage_Scope0 {
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

class studentPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html lang="en">
<head>
<title>"""),_display_(/*6.9*/title),format.raw/*6.14*/("""</title>
"""),_display_(/*7.2*/requiredAssetsCSS()),format.raw/*7.21*/("""
"""),format.raw/*8.1*/("""</head>
<body>
"""),_display_(/*10.2*/studentZoneHeader()),format.raw/*10.21*/("""
"""),format.raw/*11.1*/("""<div id="#top"></div>
    <section id="home">
    	<div id="slides">
			<div class="slides-container">
				<img src=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("images/banner-bg.jpg")),format.raw/*15.63*/("""" alt="" />
				<img src=""""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("images/banner-bg2.jpg")),format.raw/*16.64*/("""" alt="" />
				<img src=""""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("images/banner-bg3.gif")),format.raw/*17.64*/("""" alt="" />
			</div>
			<div class="tint">
				<div class="welcome text-center">
					<h1>1-to-1 Teaching Solution</h1>
					<p>Attend 24x7 online classes</p>
					<i class="fa fa-angle-down"></i>
				</div>
			</div>
		</div>
		<div id="rooms">
			<div class="container text-center">
				<div class="row no-fade">
					<div class="col-sm-4">
						<div class="box background background1">
							<h3>Select Courses</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("images/icon-soother.png")),format.raw/*36.69*/("""" alt="" />
						</div>
						<div class="arrow background background1"></div>
					</div>
					<div class="col-sm-4">
						<div class="box background background2">
							<h3>Select Tutor</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*46.19*/routes/*46.25*/.Assets.versioned("images/icon-bear.png")),format.raw/*46.66*/("""" alt="" />
						</div>
						<div class="arrow background background2"></div>
					</div>
					<div class="col-sm-4">
						<div class="box background background3">
							<h3>Ask Doubts</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit, ante ut consequat tempor, sapien urna adipiscing leo, vitae lacinia ante nibh.</p>
						</div>
						<div class="icon img-circle">
							<img src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("images/icon-horse.png")),format.raw/*56.67*/("""" alt="" />
						</div>
						<div class="arrow background background3"></div>
					</div>
				</div>
			</div>
		</div>
		
    </section>

    <!--Price Table-->
    <section id="courses" class="secPad white">
    <div class="container" style="margin-bottom: 2em;">
         <div class="heading text-center">
                <!-- Heading -->
                <h2>Courses offered</h2>
                <p>Monthly Tuitions, Exam preparation and Technical courses</p>
            </div>
         	<div class="row">
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-cogs fa-2x"></i>
						<div class="text">
							<h3>8<sup>th</sup> - 12<sup>th</sup></h3>
							Science, Mathematics, Physics etc.<br/><br/><br/><br/>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-certificate fa-2x"></i>
						<div class="text">
							<h3>IIT JEE/AIEEE</h3>
							Entrance preparation, Physics, Chemistry and Mathematics.<br/><br/><br/>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-leaf fa-2x"></i>
						<div class="text">
							<h3>HTML5/CSS3</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-tachometer fa-2x"></i>
						<div class="text">
							<h3>Web Designing</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-quote-right fa-2x"></i>
						<div class="text">
							<h3>Data Base</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="featured-box">
						<i class="fa fa-arrows fa-2x"></i>
						<div class="text">
							<h3>Mobile App Dev</h3>
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						</div>
					</div>
				</div>
			</div>
         </div>      
   </section>
    
    <section id="tutors">
      <div class="container">
       <!-- Our courses titile -->
        <div class="heading text-center">
                <!-- Heading -->
                <h2>Our Tutors</h2>
                <p>Monthly Tuitions, Exam preparation and Technical courses</p>
            </div>
        <!-- End Our courses titile -->

        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourTutors_content" style="margin-top: -3em;">
              <!-- Start Tutors nav -->
              <ul class="tutors_nav">
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*154.34*/routes/*154.40*/.Assets.versioned("images/author.jpg")),format.raw/*154.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*174.34*/routes/*174.40*/.Assets.versioned("images/course-1.jpg")),format.raw/*174.80*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li style="max-width:238px !important;">
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*194.34*/routes/*194.40*/.Assets.versioned("images/author.jpg")),format.raw/*194.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*214.34*/routes/*214.40*/.Assets.versioned("images/course-1.jpg")),format.raw/*214.80*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li >
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*234.34*/routes/*234.40*/.Assets.versioned("images/author.jpg")),format.raw/*234.78*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src=""""),_display_(/*254.34*/routes/*254.40*/.Assets.versioned("images/course-1.jpg")),format.raw/*254.80*/("""" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>                                             
              </ul>
            </div>
          </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="carousel slide" data-ride="carousel" id="quote-carousel">
                    <!-- Bottom Carousel Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#quote-carousel" data-slide-to="0" class="active"></li>
                        <li data-target="#quote-carousel" data-slide-to="1" class=""></li>
                        <li data-target="#quote-carousel" data-slide-to="2" class=""></li>
                    </ol>

                    <!-- Carousel Slides / Quotes -->
                    <div class="carousel-inner">
                        <!-- Quote 1 -->
                        <div class="item active">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*292.71*/routes/*292.77*/.Assets.versioned("images/person_1.png")),format.raw/*292.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit!</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 2 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*306.71*/routes/*306.77*/.Assets.versioned("images/person_2.png")),format.raw/*306.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam auctor nec lacus ut tempor. Mauris.</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 3 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-3 text-center">
                                        <img class="img-circle" src=""""),_display_(/*320.71*/routes/*320.77*/.Assets.versioned("images/person_3.png")),format.raw/*320.117*/("""" style="width: 100px; height: 100px;">
                                    </div>
                                    <div class="col-sm-9">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut rutrum elit in arcu blandit, eget pretium nisl accumsan. Sed ultricies commodo tortor, eu pretium mauris.</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                    </div>

                    <!-- Carousel Buttons Next/Prev -->
                    <a data-slide="prev" href="#quote-carousel" class="left carousel-control"><i class="fa fa-chevron-left"></i></a>
                    <a data-slide="next" href="#quote-carousel" class="right carousel-control"><i class="fa fa-chevron-right"></i></a>
                </div>
            </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>   

	<!--Contact -->
    <section id="joinUs" class="page-section secPad">
    <div class="heading text-center">
                <!-- Heading -->
                <h2 style="color:#000;">Join Us</h2>
                <p>For a free session now!</p>
            </div>
        <div class="container">
				<div class="row">
					<div class="col-sm-6">
						<h1 class="h1header"><b>Log In</b></h1>
						<h3>Already a Member? Log in here.</h3>
						<div id="loginFormContainer">
							"""),_display_(/*354.9*/loginForm()),format.raw/*354.20*/("""
						"""),format.raw/*355.7*/("""</div>
					</div>
					<div class="col-sm-6">
						<h1 class="h1header"><b>Register</b></h1>
						<h3>Do not have an account? Register here.</h3>
						<div id="registerFormContainer">
							"""),_display_(/*361.9*/RegisterForm("STUDENT")),format.raw/*361.32*/("""
						"""),format.raw/*362.7*/("""</div>
					</div>
				</div>
			</div>
    </section>
"""),_display_(/*367.2*/studentFooter()),format.raw/*367.17*/("""
"""),format.raw/*368.1*/("""</body>
</html>
"""),_display_(/*370.2*/requiredAssetsJS()),format.raw/*370.20*/("""
"""),format.raw/*371.1*/("""<script type="text/javascript">
$( document ).ready(function() """),format.raw/*372.32*/("""{"""),format.raw/*372.33*/("""
	"""),format.raw/*373.2*/("""studentPageInitialize();
"""),format.raw/*374.1*/("""}"""),format.raw/*374.2*/(""");
</script>"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object studentPage extends studentPage_Scope0.studentPage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 06:08:04 IST 2015
                  SOURCE: /home/Abhijeet/work/project/I-Teach/app/views/studentPage.scala.html
                  HASH: 7150d446be993de9194d1e379ebb335c1cb87c56
                  MATRIX: 757->1|867->16|894->17|968->66|993->71|1028->81|1067->100|1094->101|1136->117|1176->136|1204->137|1349->255|1364->261|1426->302|1480->329|1495->335|1558->377|1612->404|1627->410|1690->452|2373->1108|2388->1114|2453->1158|2910->1588|2925->1594|2987->1635|3442->2063|3457->2069|3520->2111|6777->5340|6793->5346|6853->5384|7915->6418|7931->6424|7993->6464|9055->7498|9071->7504|9131->7542|10157->8540|10173->8546|10235->8586|11262->9585|11278->9591|11338->9629|12364->10627|12380->10633|12442->10673|14426->12629|14442->12635|14505->12675|15356->13498|15372->13504|15435->13544|16292->14373|16308->14379|16371->14419|17939->15960|17972->15971|18007->15978|18230->16174|18275->16197|18310->16204|18393->16260|18430->16275|18459->16276|18503->16293|18543->16311|18572->16312|18664->16375|18694->16376|18724->16378|18777->16403|18806->16404
                  LINES: 27->1|32->1|33->2|37->6|37->6|38->7|38->7|39->8|41->10|41->10|42->11|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|67->36|67->36|67->36|77->46|77->46|77->46|87->56|87->56|87->56|185->154|185->154|185->154|205->174|205->174|205->174|225->194|225->194|225->194|245->214|245->214|245->214|265->234|265->234|265->234|285->254|285->254|285->254|323->292|323->292|323->292|337->306|337->306|337->306|351->320|351->320|351->320|385->354|385->354|386->355|392->361|392->361|393->362|398->367|398->367|399->368|401->370|401->370|402->371|403->372|403->372|404->373|405->374|405->374
                  -- GENERATED --
              */
          