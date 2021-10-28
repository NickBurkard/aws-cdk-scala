package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
