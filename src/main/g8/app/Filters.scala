import io.growing.micros.play.logging.AccessLogFilter
import javax.inject.Inject
import jp.co.bizreach.trace.play.filter.ZipkinTraceFilter
import play.api.http.HttpFilters

class Filters @Inject() (
    log:         AccessLogFilter,
    traceFilter: ZipkinTraceFilter) extends HttpFilters {
  val filters = Seq(log, traceFilter)
}
