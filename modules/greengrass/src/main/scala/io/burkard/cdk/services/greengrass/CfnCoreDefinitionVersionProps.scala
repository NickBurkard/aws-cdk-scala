package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCoreDefinitionVersionProps {

  def apply(
    cores: List[_],
    coreDefinitionId: String
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.Builder)
      .cores(cores.asJava)
      .coreDefinitionId(coreDefinitionId)
      .build()
}
