// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Mon Dec 30 11:29:30 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.get",
      """
        function(state0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("state", state0)])})
        }
      """
    )
  
  }


}
