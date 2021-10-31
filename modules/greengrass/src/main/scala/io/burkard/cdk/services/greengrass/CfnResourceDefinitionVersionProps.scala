package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceDefinitionVersionProps {

  def apply(
    resources: Option[List[_]] = None,
    resourceDefinitionId: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.Builder)
      .resources(resources.map(_.asJava).orNull)
      .resourceDefinitionId(resourceDefinitionId.orNull)
      .build()
}
