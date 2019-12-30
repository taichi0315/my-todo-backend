// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Mon Dec 30 19:18:48 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTodoController TodoController = new controllers.ReverseTodoController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTodoController TodoController = new controllers.javascript.ReverseTodoController(RoutesPrefix.byNamePrefix());
  }

}
