package controller

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class HelloControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HelloController GET" should {

    "render the index page from a new instance of controller" in {
      val controller = new HelloController(stubControllerComponents())
      val hello = controller.index("Ai").apply(FakeRequest(GET, "/"))

      status(hello) mustBe OK
      contentType(hello) mustBe Some("text/plain")
      contentAsString(hello) must include("Hello Ai")
    }

  }
}
