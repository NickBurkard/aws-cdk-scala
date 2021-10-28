package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAsset {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None,
    sourceRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sourceArn: Option[String] = None,
    id: Option[String] = None,
    packagingGroupId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnAsset =
    software.amazon.awscdk.services.mediapackage.CfnAsset.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .sourceRoleArn(sourceRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .sourceArn(sourceArn.orNull)
      .id(id.orNull)
      .packagingGroupId(packagingGroupId.orNull)
      .build()
}
