// @GENERATOR:play-routes-compiler
// @SOURCE:/home/digital032676/Documents/play/todolist/conf/routes
// @DATE:Wed Apr 04 13:33:48 BST 2018


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
