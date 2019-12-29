// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Sun Dec 29 20:11:14 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
