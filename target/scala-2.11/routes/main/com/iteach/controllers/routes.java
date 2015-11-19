
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Abhijeet/work/project/I-Teach/conf/routes
// @DATE:Tue Nov 17 06:46:55 IST 2015

package com.iteach.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final com.iteach.controllers.ReverseLoginController LoginController = new com.iteach.controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final com.iteach.controllers.ReverseApplication Application = new com.iteach.controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final com.iteach.controllers.javascript.ReverseLoginController LoginController = new com.iteach.controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final com.iteach.controllers.javascript.ReverseApplication Application = new com.iteach.controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
