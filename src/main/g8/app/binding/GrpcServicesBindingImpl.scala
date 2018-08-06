package binding

import io.growing.micros.play.binding.GrpcServicesBinding
import javax.inject.Singleton

/**
 * Component:
 * Description:
 * Date: 2018/7/24
 *
 * @author AI
 */
@Singleton
class GrpcServicesBindingImpl extends GrpcServicesBinding {

  override def getServiceClasses: Seq[Class[_]] = Seq.empty

}
