// @GENERATOR:play-routes-compiler
// @SOURCE:/home/digital032676/Documents/play/todolist/conf/routes
// @DATE:Wed Apr 04 13:33:48 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def tasks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tasks")
    }
  
    // @LINE:7
    def index(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:17
    def newTask(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tasks")
    }
  
    // @LINE:18
    def deleteTask(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tasks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/delete")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
