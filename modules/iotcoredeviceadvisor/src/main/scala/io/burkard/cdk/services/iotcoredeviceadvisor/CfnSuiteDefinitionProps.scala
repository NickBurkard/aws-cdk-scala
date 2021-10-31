package io.burkard.cdk.services.iotcoredeviceadvisor

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
