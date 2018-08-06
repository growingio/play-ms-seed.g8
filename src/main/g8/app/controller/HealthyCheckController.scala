package controller

import javax.inject.{ Inject, Singleton }
import jp.co.bizreach.trace.ZipkinTraceServiceLike
import jp.co.bizreach.trace.play.implicits.ZipkinTraceImplicits
import play.api.mvc.{ AbstractController, Action, AnyContent, ControllerComponents }

/**
 * Component:
 * Description:
 * Date: 2018/7/16
 *
 * @author AI
 */
@Singleton
class HealthyCheckController @Inject() (
    cc:         ControllerComponents,
    val tracer: ZipkinTraceServiceLike) extends AbstractController(cc) with ZipkinTraceImplicits {

  def healthyCheck(): Action[AnyContent] = Action { _ ⇒
    Ok("imok")
  }

}
