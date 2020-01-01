package controllers

import javax.inject.Inject

import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.Action
import play.api.libs.json._

import persistence.todo.dao.TodoDAO
import persistence.todo.model.Todo

class TodoController @Inject() (
  todoDao:  TodoDAO,
  cc:       ControllerComponents
) extends AbstractController(cc) {  
  implicit lazy val executionContext = defaultExecutionContext

  def post =
    Action(parse.json) { implicit request =>
      val json: JsValue = request.body
      val todoFromJson: JsResult[Todo] = Json.fromJson[Todo](json)

      todoFromJson match {
        case JsSuccess(todo: Todo, path: JsPath) =>
          todoDao.add(todo)
          Ok("Success")
        case e @ JsError(_) =>
          BadRequest("Errors:" + JsError.toJson(e).toString())
      }
    }
  
  def list(state: String) = 
    Action.async { implicit request =>
      for {
        todoSeq <- todoDao.findByState(state)
      } yield {
        Ok(Json.toJson(todoSeq))
      }
    }
  def update =
    Action(parse.json) { implicit request =>
      val json: JsValue = request.body
      val todoFromJson: JsResult[Todo] = Json.fromJson[Todo](json)

      todoFromJson match {
        case JsSuccess(todo: Todo, path: JsPath) =>
          todoDao.update(todo.id, todo.state)
          Ok("Success")
        case e @ JsError(_) =>
          BadRequest("Errors:" + JsError.toJson(e).toString())
      }
    }
}