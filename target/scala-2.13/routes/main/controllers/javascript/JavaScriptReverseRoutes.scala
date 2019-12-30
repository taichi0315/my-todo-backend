// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Mon Dec 30 14:17:33 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0)) + "/update"})
        }
      """
    )
  
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
