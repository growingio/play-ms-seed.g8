package dao

import com.google.inject.ImplementedBy
import dao.impl.$model;format="Camel"$Impl
import model.$model;format="Camel"$

import scala.concurrent.Future

trait $model;format="Camel"$Dao {

  def findById(id: Long): Future[Option[$model;format="Camel"$]]

}