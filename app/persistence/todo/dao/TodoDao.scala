package persistence.user.dao


import javax.inject.Inject
import java.time.LocalDateTime
import scala.concurrent.Future

import slick.jdbc.JdbcProfile
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import persistence.user.model.User

class UserDAO @Inject()(
  val dbConfigProvider: DatabaseConfigProvider
) extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._

  lazy val slick = TableQuery[UserTable]

  def findAll: Future[Seq[User]] = 
    db.run {
      slick.result
    }

  class UserTable(tag: Tag) extends Table[User](tag, "users") {

    def id        = column[User.Id]       ("id")
    def name      = column[String]        ("name")
    def email     = column[String]        ("email")
    def password  = column[String]        ("password")
    
    def * = (
      id.?, name, email, password
    ) <> (
      (User.apply _).tupled,
      (v: TableElementType) => User.unapply(v)
    )
  }
}