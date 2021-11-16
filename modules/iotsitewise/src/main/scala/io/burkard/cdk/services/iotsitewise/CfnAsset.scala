package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAsset {

  def apply(
    internalResourceId: String,
    assetModelId: String,
    assetName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assetProperties: Option[List[_]] = None,
    assetHierarchies: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnAsset =
    software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder
      .create(stackCtx, internalResourceId)
      .assetModelId(assetModelId)
      .assetName(assetName)
      .tags(tags.map(_.asJava).orNull)
      .assetProperties(assetProperties.map(_.asJava).orNull)
      .assetHierarchies(assetHierarchies.map(_.asJava).orNull)
      .build()
}
