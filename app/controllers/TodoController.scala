package controllers

import javax.inject.Inject

import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.Action
import play.api.libs.json._

import persistence.todo.dao.TodoDAO

class TodoController @Inject() (
  todoDao:  TodoDAO,
  cc:       ControllerComponents
) extends AbstractController(cc) {
  implicit lazy val executionContext = defaultExecutionContext

  def get = Action.async { implicit request =>
    for {
      todoSeq <- todoDao.findAll
    } yield {
      Ok(Json.toJson(todoSeq))
    }
  }
}