
// @GENERATOR:play-routes-compiler
// @SOURCE:/workspace/thesora/conf/routes
// @DATE:Mon Sep 14 11:36:58 EDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cat""", """controllers.Application.catindex"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insert""", """controllers.Application.insert"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.Application.tasks()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.Application.newTask()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""", """controllers.Application.deleteTask(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items""", """controllers.Items.list(page:Int ?= 1)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items""", """controllers.Items.create"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items/$id<[^/]+>""", """controllers.Items.details(id:Long)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items/$id<[^/]+>""", """controllers.Items.update(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """items/$id<[^/]+>""", """controllers.Items.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vocs""", """controllers.Application.vocs()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vocs""", """controllers.Application.newVoc()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_catindex1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cat")))
  )
  private[this] lazy val controllers_Application_catindex1_invoker = createInvoker(
    controllers.Application.catindex,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "catindex",
      Nil,
      "GET",
      """""",
      this.prefix + """cat"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_insert2_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_Application_insert2_invoker = createInvoker(
    controllers.Application.insert,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insert",
      Nil,
      "POST",
      """""",
      this.prefix + """insert"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_tasks3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_Application_tasks3_invoker = createInvoker(
    controllers.Application.tasks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "tasks",
      Nil,
      "GET",
      """ Tasks""",
      this.prefix + """tasks"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_newTask4_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_Application_newTask4_invoker = createInvoker(
    controllers.Application.newTask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newTask",
      Nil,
      "POST",
      """""",
      this.prefix + """tasks"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_deleteTask5_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Application_deleteTask5_invoker = createInvoker(
    controllers.Application.deleteTask(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteTask",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """tasks/$id<[^/]+>/delete"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Items_list6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items")))
  )
  private[this] lazy val controllers_Items_list6_invoker = createInvoker(
    controllers.Items.list(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "list",
      Seq(classOf[Int]),
      "GET",
      """ Items""",
      this.prefix + """items"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Items_create7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items")))
  )
  private[this] lazy val controllers_Items_create7_invoker = createInvoker(
    controllers.Items.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """items"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Items_details8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_details8_invoker = createInvoker(
    controllers.Items.details(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "details",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """items/$id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Items_update9_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_update9_invoker = createInvoker(
    controllers.Items.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """items/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Items_delete10_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("items/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Items_delete10_invoker = createInvoker(
    controllers.Items.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Items",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """items/$id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_vocs11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vocs")))
  )
  private[this] lazy val controllers_Application_vocs11_invoker = createInvoker(
    controllers.Application.vocs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "vocs",
      Nil,
      "GET",
      """ Vocabulary""",
      this.prefix + """vocs"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_newVoc12_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vocs")))
  )
  private[this] lazy val controllers_Application_newVoc12_invoker = createInvoker(
    controllers.Application.newVoc(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newVoc",
      Nil,
      "POST",
      """""",
      this.prefix + """vocs"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ 
 Map static resources from the /public folder to the /assets URL path
GET     /assets/*file           controllers.Assets.versioned(path="/public", file:Asset)""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_WebJarAssets_at14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at14_invoker = createInvoker(
    controllers.WebJarAssets.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
      }
  
    // @LINE:8
    case controllers_Application_catindex1_route(params) =>
      call { 
        controllers_Application_catindex1_invoker.call(controllers.Application.catindex)
      }
  
    // @LINE:10
    case controllers_Application_insert2_route(params) =>
      call { 
        controllers_Application_insert2_invoker.call(controllers.Application.insert)
      }
  
    // @LINE:18
    case controllers_Application_tasks3_route(params) =>
      call { 
        controllers_Application_tasks3_invoker.call(controllers.Application.tasks())
      }
  
    // @LINE:19
    case controllers_Application_newTask4_route(params) =>
      call { 
        controllers_Application_newTask4_invoker.call(controllers.Application.newTask())
      }
  
    // @LINE:20
    case controllers_Application_deleteTask5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteTask5_invoker.call(controllers.Application.deleteTask(id))
      }
  
    // @LINE:23
    case controllers_Items_list6_route(params) =>
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
        controllers_Items_list6_invoker.call(controllers.Items.list(page))
      }
  
    // @LINE:24
    case controllers_Items_create7_route(params) =>
      call { 
        controllers_Items_create7_invoker.call(controllers.Items.create)
      }
  
    // @LINE:25
    case controllers_Items_details8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Items_details8_invoker.call(controllers.Items.details(id))
      }
  
    // @LINE:26
    case controllers_Items_update9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Items_update9_invoker.call(controllers.Items.update(id))
      }
  
    // @LINE:27
    case controllers_Items_delete10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Items_delete10_invoker.call(controllers.Items.delete(id))
      }
  
    // @LINE:30
    case controllers_Application_vocs11_route(params) =>
      call { 
        controllers_Application_vocs11_invoker.call(controllers.Application.vocs())
      }
  
    // @LINE:31
    case controllers_Application_newVoc12_route(params) =>
      call { 
        controllers_Application_newVoc12_invoker.call(controllers.Application.newVoc())
      }
  
    // @LINE:36
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:38
    case controllers_WebJarAssets_at14_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at14_invoker.call(controllers.WebJarAssets.at(file))
      }
  }
}