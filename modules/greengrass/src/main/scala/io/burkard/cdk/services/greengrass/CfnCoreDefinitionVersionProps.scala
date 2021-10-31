package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCoreDefinitionVersionProps {

  def apply(
    cores: Option[List[_]] = None,
    coreDefinitionId: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.Builder)
      .cores(cores.map(_.asJava).orNull)
      .coreDefinitionId(coreDefinitionId.orNull)
      .build()
}
