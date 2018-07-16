package pattern

import org.apache.commons.lang3.StringUtils
import org.scalatestplus.play.PlaySpec

/**
 * Component:
 * Description:
 * Date: 2018/7/16
 *
 * @author AI
 */
class ServiceApiPatternSpec extends PlaySpec {

  "Extract pattern" must {

    "extract service patterns" in {
      val api = """/$name<[^/]+>/$ai<[^/]+>"""
      val regex = """\$\w+<([^$]+)>"""
      val s = StringUtils.replacePattern(api, regex, "$1")
      assert("""/[^/]+/[^/]+""" == s)
      assert("/healthy-check" == StringUtils.replacePattern("/healthy-check", regex, "$1"))
    }

  }

}
