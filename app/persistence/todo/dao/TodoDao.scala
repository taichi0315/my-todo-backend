package persistence.todo.dao


import javax.inject.Inject
import java.time.LocalDate
import scala.concurrent.Future

import slick.jdbc.JdbcProfile
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import persistence.todo.model.Todo

class TodoDAO @Inject()(
  val dbConfigProvider: DatabaseConfigProvider
) extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._

  lazy val slick = TableQuery[TodoTable]

  def findAll: Future[Seq[Todo]] = 
    db.run {
      slick.result
    }
  
  def findByState(state: String): Future[Seq[Todo]] =
    db.run {
      slick
        .filter(_.state === state)
        .result
    }

  class TodoTable(tag: Tag) extends Table[Todo](tag, "todos") {

    def id        = column[Todo.Id]       ("id")
    def name      = column[String]        ("name")
    def state     = column[String]        ("state")
    def dueDate   = column[LocalDate]     ("due_date")
    
    def * = (
      id.?, name, state, dueDate
    ) <> (
      (Todo.apply _).tupled,
      (v: TableElementType) => Todo.unapply(v)
    )
  }
}