
// @GENERATOR:play-routes-compiler
// @SOURCE:/workspace/thesora/conf/routes
// @DATE:Mon Sep 14 11:36:58 EDT 2015


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
