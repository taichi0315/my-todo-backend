// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Wed Jan 01 10:48:13 JST 2020

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
    def post(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:5
    def update(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "todo/update")
    }
  
    // @LINE:3
    def list(state:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo/list" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("state", state)))))
    }
  
  }


}
