package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAsset {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assetModelId: Option[String] = None,
    assetProperties: Option[List[_]] = None,
    assetHierarchies: Option[List[_]] = None,
    assetName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnAsset =
    software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .assetModelId(assetModelId.orNull)
      .assetProperties(assetProperties.map(_.asJava).orNull)
      .assetHierarchies(assetHierarchies.map(_.asJava).orNull)
      .assetName(assetName.orNull)
      .build()
}
