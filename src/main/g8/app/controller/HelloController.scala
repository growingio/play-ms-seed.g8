package controller

import com.typesafe.scalalogging.LazyLogging
import javax.inject._
import jp.co.bizreach.trace.ZipkinTraceServiceLike
import jp.co.bizreach.trace.play.implicits.ZipkinTraceImplicits
import play.api.mvc._

import scala.concurrent.Future

@Singleton
class HelloController @Inject() (
    cc:         ControllerComponents,
    val tracer: ZipkinTraceServiceLike) extends AbstractController(cc) with LazyLogging with ZipkinTraceImplicits {

  def index(name: String): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] ⇒
    Future.successful(Ok(s"Hello \$name"))
  }
}
