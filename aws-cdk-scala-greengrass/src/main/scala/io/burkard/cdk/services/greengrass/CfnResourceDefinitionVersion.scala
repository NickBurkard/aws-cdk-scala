package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDefinitionVersion {

  def apply(
    internalResourceId: String,
    resources: Option[List[_]] = None,
    resourceDefinitionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .resources(resources.map(_.asJava).orNull)
      .resourceDefinitionId(resourceDefinitionId.orNull)
      .build()
}
