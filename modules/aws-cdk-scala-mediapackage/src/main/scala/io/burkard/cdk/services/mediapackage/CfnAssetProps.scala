package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssetProps {

  def apply(
    resourceId: Option[String] = None,
    sourceRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sourceArn: Option[String] = None,
    id: Option[String] = None,
    packagingGroupId: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnAssetProps =
    (new software.amazon.awscdk.services.mediapackage.CfnAssetProps.Builder)
      .resourceId(resourceId.orNull)
      .sourceRoleArn(sourceRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .sourceArn(sourceArn.orNull)
      .id(id.orNull)
      .packagingGroupId(packagingGroupId.orNull)
      .build()
}
