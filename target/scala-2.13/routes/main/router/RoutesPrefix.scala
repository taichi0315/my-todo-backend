// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/movies-for-me-backend-scala/conf/routes
// @DATE:Sat Dec 07 18:15:05 JST 2019


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
