package module

import binding.GrpcServicesBindingImpl
import com.google.inject.AbstractModule
import io.growing.micros.play.binding.GrpcServicesBinding
import io.growing.micros.play.component.GrpcServiceComponent

/**
 * Component:
 * Description:
 * Date: 2018/7/17
 *
 * @author AI
 */
class GrpcServiceModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[GrpcServicesBinding]).to(classOf[GrpcServicesBindingImpl])
    bind(classOf[GrpcServiceComponent]).asEagerSingleton()
  }

}
