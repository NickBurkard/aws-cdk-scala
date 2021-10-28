package io.burkard.cdk.services.inspector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceGroupProps {

  def apply(
    resourceGroupTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.inspector.CfnResourceGroupProps =
    (new software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder)
      .resourceGroupTags(resourceGroupTags.map(_.asJava).orNull)
      .build()
}
