
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Play/play-Assignment-1/PlayAssignment-1-Vandana-Yadav/conf/routes
// @DATE:Wed Mar 08 10:12:40 IST 2017


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
