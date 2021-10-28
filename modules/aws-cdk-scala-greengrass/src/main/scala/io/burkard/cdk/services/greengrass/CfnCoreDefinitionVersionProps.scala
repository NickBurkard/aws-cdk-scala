package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
