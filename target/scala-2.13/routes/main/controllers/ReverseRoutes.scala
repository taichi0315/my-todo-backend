// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/movies-for-me-backend-scala/conf/routes
// @DATE:Sat Dec 07 18:15:05 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHelloController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
