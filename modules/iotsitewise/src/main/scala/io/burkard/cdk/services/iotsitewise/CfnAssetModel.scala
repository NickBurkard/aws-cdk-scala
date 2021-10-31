package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssetModel {

  def apply(
    internalResourceId: String,
    assetModelProperties: Option[List[_]] = None,
    assetModelCompositeModels: Option[List[_]] = None,
    assetModelHierarchies: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assetModelDescription: Option[String] = None,
    assetModelName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotsitewise.CfnAssetModel =
    software.amazon.awscdk.services.iotsitewise.CfnAssetModel.Builder
      .create(stackCtx, internalResourceId)
      .assetModelProperties(assetModelProperties.map(_.asJava).orNull)
      .assetModelCompositeModels(assetModelCompositeModels.map(_.asJava).orNull)
      .assetModelHierarchies(assetModelHierarchies.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .assetModelDescription(assetModelDescription.orNull)
      .assetModelName(assetModelName.orNull)
      .build()
}
