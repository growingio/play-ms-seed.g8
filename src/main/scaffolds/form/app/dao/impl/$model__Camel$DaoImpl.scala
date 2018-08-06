package dao.impl

import dao.$model;format="Camel"$Dao
import dao.component.$model;format="Camel"$Component
import javax.inject.{ Inject, Singleton }
import model.$model;format="Camel"$
import play.api.db.slick.{ DatabaseConfigProvider, HasDatabaseConfigProvider }
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Future

@Singleton
class $model;format="Camel"$DaoImpl @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)
  extends $model;format="Camel"$Dao with $model;format="Camel"$Component with HasDatabaseConfigProvider[JdbcProfile] {

  override def findById(id: Long): Future[Option[$model;format="Camel"$]] = {
    db.run($model$s.filter(_.id === id).result.headOption)
  }

}