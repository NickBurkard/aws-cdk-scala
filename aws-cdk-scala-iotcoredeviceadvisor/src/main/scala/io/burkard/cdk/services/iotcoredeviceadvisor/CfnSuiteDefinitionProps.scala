package io.burkard.cdk.services.iotcoredeviceadvisor

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSuiteDefinitionProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    suiteDefinitionConfiguration: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps =
    (new software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinitionProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .suiteDefinitionConfiguration(suiteDefinitionConfiguration.orNull)
      .build()
}
