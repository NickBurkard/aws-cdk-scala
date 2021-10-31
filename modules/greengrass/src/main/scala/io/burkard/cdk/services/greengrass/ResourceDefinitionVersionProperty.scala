package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceDefinitionVersionProperty {

  def apply(
    resources: Option[List[_]] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder)
      .resources(resources.map(_.asJava).orNull)
      .build()
}
