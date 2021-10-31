package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CoreDefinitionVersionProperty {

  def apply(
    cores: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnCoreDefinition.CoreDefinitionVersionProperty.Builder)
      .cores(cores.map(_.asJava).orNull)
      .build()
}
