
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lili/Escritorio/proyecto3/taller2/conf/routes
// @DATE:Sat Sep 03 16:30:23 COT 2016


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
