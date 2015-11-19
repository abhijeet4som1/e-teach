
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/Abhijeet/work/project/I-Teach/conf/routes
// @DATE:Tue Nov 17 06:46:55 IST 2015


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
