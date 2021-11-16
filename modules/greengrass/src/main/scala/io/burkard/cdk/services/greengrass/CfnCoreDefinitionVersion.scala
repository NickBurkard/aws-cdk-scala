package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCoreDefinitionVersion {

  def apply(
    internalResourceId: String,
    cores: List[_],
    coreDefinitionId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion =
    software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder
      .create(stackCtx, internalResourceId)
      .cores(cores.asJava)
      .coreDefinitionId(coreDefinitionId)
      .build()
}
