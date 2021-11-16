package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAsset {

  def apply(
    internalResourceId: String,
    sourceRoleArn: String,
    sourceArn: String,
    id: String,
    packagingGroupId: String,
    resourceId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnAsset =
    software.amazon.awscdk.services.mediapackage.CfnAsset.Builder
      .create(stackCtx, internalResourceId)
      .sourceRoleArn(sourceRoleArn)
      .sourceArn(sourceArn)
      .id(id)
      .packagingGroupId(packagingGroupId)
      .resourceId(resourceId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
