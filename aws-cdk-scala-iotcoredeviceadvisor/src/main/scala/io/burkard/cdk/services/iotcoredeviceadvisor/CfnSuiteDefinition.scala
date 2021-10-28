package io.burkard.cdk.services.iotcoredeviceadvisor

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSuiteDefinition {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    suiteDefinitionConfiguration: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition =
    software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .suiteDefinitionConfiguration(suiteDefinitionConfiguration.orNull)
      .build()
}
