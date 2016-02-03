
// @GENERATOR:play-routes-compiler
// @SOURCE:/workspace/thesora/conf/routes
// @DATE:Mon Sep 14 11:36:58 EDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseItems(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.delete",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "items/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:24
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "items"})
        }
      """
    )
  
    // @LINE:23
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.list",
      """
        function(page) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "items" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page))])})
        }
      """
    )
  
    // @LINE:26
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.update",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "items/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:25
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Items.details",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "items/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def tasks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tasks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
        }
      """
    )
  
    // @LINE:31
    def newVoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newVoc",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vocs"})
        }
      """
    )
  
    // @LINE:20
    def deleteTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteTask",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
        }
      """
    )
  
    // @LINE:10
    def insert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.insert",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:30
    def vocs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.vocs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vocs"})
        }
      """
    )
  
    // @LINE:19
    def newTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def catindex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.catindex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cat"})
        }
      """
    )
  
  }


}