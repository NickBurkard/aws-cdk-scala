package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceGroupProps {

  def apply(
    resourceGroupTags: List[_]
  ): software.amazon.awscdk.services.inspector.CfnResourceGroupProps =
    (new software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder)
      .resourceGroupTags(resourceGroupTags.asJava)
      .build()
}
