package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceDefinitionVersionProps {

  def apply(
    resources: List[_],
    resourceDefinitionId: String
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.Builder)
      .resources(resources.asJava)
      .resourceDefinitionId(resourceDefinitionId)
      .build()
}
