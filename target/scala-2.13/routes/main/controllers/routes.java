// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Sun Dec 29 19:26:24 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHelloController HelloController = new controllers.ReverseHelloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHelloController HelloController = new controllers.javascript.ReverseHelloController(RoutesPrefix.byNamePrefix());
  }

}
