package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssetProps {

  def apply(
    sourceRoleArn: String,
    sourceArn: String,
    id: String,
    packagingGroupId: String,
    resourceId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.mediapackage.CfnAssetProps =
    (new software.amazon.awscdk.services.mediapackage.CfnAssetProps.Builder)
      .sourceRoleArn(sourceRoleArn)
      .sourceArn(sourceArn)
      .id(id)
      .packagingGroupId(packagingGroupId)
      .resourceId(resourceId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
