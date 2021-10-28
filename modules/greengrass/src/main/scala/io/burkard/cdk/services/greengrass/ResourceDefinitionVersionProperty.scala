package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceDefinitionVersionProperty {

  def apply(
    resources: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder)
      .resources(resources.map(_.asJava).orNull)
      .build()
}
