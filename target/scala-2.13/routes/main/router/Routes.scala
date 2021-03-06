// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kushirotaichi/Desktop/my-todo-backend/conf/routes
// @DATE:Wed Jan 01 10:48:13 JST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  TodoController_0: controllers.TodoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    TodoController_0: controllers.TodoController
  ) = this(errorHandler, TodoController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TodoController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.TodoController.post()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo/list""", """controllers.TodoController.list(state:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo/update""", """controllers.TodoController.update()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_TodoController_post0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_TodoController_post0_invoker = createInvoker(
    TodoController_0.post(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "post",
      Nil,
      "POST",
      this.prefix + """todo""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_TodoController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo/list")))
  )
  private[this] lazy val controllers_TodoController_list1_invoker = createInvoker(
    TodoController_0.list(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "list",
      Seq(classOf[String]),
      "GET",
      this.prefix + """todo/list""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_TodoController_update2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo/update")))
  )
  private[this] lazy val controllers_TodoController_update2_invoker = createInvoker(
    TodoController_0.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "update",
      Nil,
      "PUT",
      this.prefix + """todo/update""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_TodoController_post0_route(params@_) =>
      call { 
        controllers_TodoController_post0_invoker.call(TodoController_0.post())
      }
  
    // @LINE:3
    case controllers_TodoController_list1_route(params@_) =>
      call(params.fromQuery[String]("state", None)) { (state) =>
        controllers_TodoController_list1_invoker.call(TodoController_0.list(state))
      }
  
    // @LINE:5
    case controllers_TodoController_update2_route(params@_) =>
      call { 
        controllers_TodoController_update2_invoker.call(TodoController_0.update())
      }
  }
}
