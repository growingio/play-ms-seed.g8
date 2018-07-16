package boostrap

import io.growing.dryad.ServiceProvider
import io.growing.dryad.portal.Schema
import javax.inject.{ Inject, Singleton }
import org.apache.commons.lang3.StringUtils
import play.api.inject.ApplicationLifecycle
import play.api.routing.Router
import play.api.{ Application, Mode }

import scala.concurrent.Future
import scala.util.control.NonFatal
import play.api.Logger

/**
 * Component:
 * Description:
 * Date: 2018/7/14
 *
 * @author AI
 */
@Singleton
class ServiceProviderRegister @Inject() (router: Router, app: Application, lifecycle: ApplicationLifecycle) {

  private[this] lazy val regex: String = """\$\w+<([^$]+)>"""

  register()

  private[boostrap] def register(): Unit = {
    val patterns = router.documentation.map {
      case (_, route, _) ⇒ StringUtils.replacePattern(route, regex, "$1")
      case _             ⇒ throw new IllegalAccessException("cannot read router.documentation")
    }.distinct
    try {
      val provider = ServiceProvider(app.configuration.underlying)
      provider.register(Schema.HTTP -> patterns)
      Logger.info("service register success")
      lifecycle.addStopHook(() ⇒ Future.successful {
        provider.deregister()
        Logger.info("service deregister success")
      })
    } catch {
      case NonFatal(t) ⇒
        if (app.mode == Mode.Prod) {
          Logger.error(t.getLocalizedMessage, t)
        } else {
          Logger.warn(s"service register failure: ${t.getLocalizedMessage}")
        }
    }
  }

}
