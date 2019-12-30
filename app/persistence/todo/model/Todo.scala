package persistence.todo.model

import play.api.data._
import java.time.LocalDate
import play.api.libs.json._

case class Todo(
  id:        Option[Todo.Id],                 
  name:      String,                            
  state:     String,
  dueDate:   LocalDate,                           
)

object Todo {
  type Id = Int

  implicit val todoReads = Json.reads[Todo]
  implicit val todoFormat = Json.format[Todo]
}