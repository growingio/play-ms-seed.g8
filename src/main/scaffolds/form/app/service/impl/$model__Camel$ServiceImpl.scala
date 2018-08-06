package service.impl

import dao.$model;format="Camel"$Dao
import javax.inject.{ Inject, Singleton }
import model.$model;format="Camel"$
import service.$model;format="Camel"$Service

import scala.concurrent.Future

@Singleton
class $model;format="Camel"$ServiceImpl @Inject() ($model$Dao: $model;format="Camel"$Dao) extends $model;format="Camel"$Service {

  override def findById(id: Long): Future[Option[$model;format="Camel"$]] = $model$Dao.findById(id)

}
