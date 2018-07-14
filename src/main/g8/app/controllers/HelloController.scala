package controllers

import javax.inject._
import play.api.mvc._

import scala.concurrent.Future

@Singleton
class HelloController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def index(): Action[AnyContent] = Action.async { implicit request: Request[AnyContent] ⇒
    Future.successful(Ok("Hello"))
  }
}
