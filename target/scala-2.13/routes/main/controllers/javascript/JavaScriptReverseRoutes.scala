// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Wed Jan 01 10:48:13 JST 2020

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
    def post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.post",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:5
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.update",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/update"})
        }
      """
    )
  
    // @LINE:3
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.list",
      """
        function(state0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/list" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("state", state0)])})
        }
      """
    )
  
  }


}
