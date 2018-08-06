package form

import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

final case class $model;format="Camel"$Form(id: Long, name: String)

object $model;format="Camel"$Form {

  lazy val nameMaxLength = 100

  implicit val reads: Reads[$model;format="Camel"$Form] = (
  (JsPath \ "id").read[Long] and
  (JsPath \ "name").read[String](maxLength[String](nameMaxLength)))($model;format="Camel"$Form.apply _)

  implicit val writes: Writes[$model;format="Camel"$Form] = (
  (JsPath \ "id").write[Long] and
  (JsPath \ "name").write[String])(unlift($model;format="Camel"$Form.unapply))

}
