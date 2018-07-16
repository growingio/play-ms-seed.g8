package modules

import com.google.inject.AbstractModule
import boostrap.ServiceProviderRegister

/**
 * Component:
 * Description:
 * Date: 2018/7/14
 *
 * @author AI
 */

class ServiceProviderModule extends AbstractModule {

  override def configure(): Unit = {
    bind(classOf[ServiceProviderRegister]).asEagerSingleton()
  }

}
