package io.burkard.cdk.services.iotcoredeviceadvisor

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSuiteDefinition {

  def apply(
    internalResourceId: String,
    suiteDefinitionConfiguration: AnyRef,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition =
    software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition.Builder
      .create(stackCtx, internalResourceId)
      .suiteDefinitionConfiguration(suiteDefinitionConfiguration)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
