// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Mon Dec 30 11:29:30 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get(state:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todos" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("state", state)))))
    }
  
  }


}
