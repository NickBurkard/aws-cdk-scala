package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceGroup {

  def apply(
    internalResourceId: String,
    resourceGroupTags: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.inspector.CfnResourceGroup =
    software.amazon.awscdk.services.inspector.CfnResourceGroup.Builder
      .create(stackCtx, internalResourceId)
      .resourceGroupTags(resourceGroupTags.asJava)
      .build()
}
