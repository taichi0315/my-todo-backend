// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/movies-for-me-backend-scala/conf/routes
// @DATE:Sat Dec 07 18:15:05 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHelloController HelloController = new controllers.ReverseHelloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHelloController HelloController = new controllers.javascript.ReverseHelloController(RoutesPrefix.byNamePrefix());
  }

}
