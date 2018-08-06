package controller

import form.$model;format="Camel"$Form
import io.growing.micros.persistence.EntityNotFoundException
import io.growing.micros.play.module.HashIdsModule._
import io.growing.micros.play.mvc.ActionComponents
import javax.inject.{ Inject, Singleton }
import play.api.libs.json.Json
import play.api.mvc.{ AbstractController, Action, AnyContent, ControllerComponents }
import service.$model;format="Camel"$Service

import scala.concurrent.ExecutionContext

@Singleton
class $model;format="Camel"$Controller @Inject() (
    ac:             ActionComponents,
    cc:             ControllerComponents,
    $model$Service: $model;format="Camel"$Service)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def get(uid: String): Action[AnyContent] = ac.timeout.async { implicit request ⇒
    $model$Service.findById(uid.toId).map {
      case None          ⇒ throw EntityNotFoundException(uid)
      case Some($model$) ⇒ Ok(Json.toJson($model;format="Camel"$Form($model$.id, $model$.name)))
    }
  }

}
