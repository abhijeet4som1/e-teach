package com.iteach.controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.studentHome;
import views.html.studentPage;
import views.html.tutorHome;
import views.html.tutorPage;

public class Application extends Controller {

	/**
	 * Method returning the index page.
	 * 
	 * @return
	 */
	public Result index() {
		return ok(index.render("I-Teach"));
	}

	/**
	 * controller method returning the student page
	 * 
	 * @return
	 */
	public Result studentZone() {
		return ok(studentPage.render("I-Teach"));
	}

	/**
	 * controller page returning the tutor page.
	 * 
	 * @return
	 */
	public Result tutorZone() {
		return ok(tutorPage.render("I-Teach"));
	}

	public Result studentHome() {
		return ok(studentHome.render());
	}

	public Result tutorHome() {
		return ok(tutorHome.render());
	}

}
