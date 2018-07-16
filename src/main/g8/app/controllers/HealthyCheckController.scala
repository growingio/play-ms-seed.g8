package controllers

import javax.inject.{ Inject, Singleton }
import play.api.mvc.{ AbstractController, Action, AnyContent, ControllerComponents }

/**
 * Component:
 * Description:
 * Date: 2018/7/16
 *
 * @author AI
 */
@Singleton
class HealthyCheckController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def healthyCheck(): Action[AnyContent] = Action { _ ⇒
    Ok("imok")
  }

}
