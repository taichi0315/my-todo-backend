package persistence.user.model

import play.api.data._
import play.api.data.Forms._
import java.time.LocalDateTime
import play.api.libs.json._

case class User(
  id:        Option[User.Id],                 
  name:      String,                            
  email:     String,
  password:  String,                           
)

object User {
  type Id = String

  implicit val userFormat = Json.format[User]
}