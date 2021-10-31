package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCoreDefinitionVersion {

  def apply(
    internalResourceId: String,
    cores: Option[List[_]] = None,
    coreDefinitionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .cores(cores.map(_.asJava).orNull)
      .coreDefinitionId(coreDefinitionId.orNull)
      .build()
}
