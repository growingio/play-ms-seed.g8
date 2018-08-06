package dao.component

import model.$model;format="Camel"$
import play.api.db.slick.HasDatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.{ Rep, Tag }
import slick.jdbc.PostgresProfile.api._

trait $model;format="Camel"$Component {
  self: HasDatabaseConfigProvider[JdbcProfile] ⇒

  class $model;format="Camel"$Table(tag: Tag) extends Table[$model;format="Camel"$](tag, "$model$s") {

    def id: Rep[Long] = column[Long]("id", O.PrimaryKey)

    def name: Rep[String] = column[String]("name")

    override def * = (id, name) <> ($model;format="Camel"$.tupled, $model;format="Camel"$.unapply)
  }

  val $model$s = TableQuery[$model;format="Camel"$Table]

}
