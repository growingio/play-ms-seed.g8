package service

import com.google.inject.ImplementedBy
import model.$model;format="Camel"$
import service.impl.$model;format="Camel"$ServiceImpl

import scala.concurrent.Future

@ImplementedBy(classOf[$model;format="Camel"$ServiceImpl])
trait $model;format="Camel"$Service {

  def findById(id: Long): Future[Option[$model;format="Camel"$]]

}
