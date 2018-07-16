package controllers

import javax.inject._
import play.api.mvc._

import scala.concurrent.Future

@Singleton
class HelloController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def index(name: String): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] ⇒
    Future.successful(Ok(s"Hello $name"))
  }
}
