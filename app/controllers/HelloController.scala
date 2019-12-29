package controllers

import javax.inject.Inject

import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.Action
import play.api.libs.json._

import persistence.user.dao.UserDAO

class HelloController @Inject() (
  userDao:  UserDAO,
  cc:       ControllerComponents
) extends AbstractController(cc) {
  implicit lazy val executionContext = defaultExecutionContext

  def get = Action.async { implicit request =>
    for {
      userSeq <- userDao.findAll
    } yield {
      Ok(Json.toJson(userSeq))
    }
  }
}