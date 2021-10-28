package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssetModelProps {

  def apply(
    assetModelProperties: Option[List[_]] = None,
    assetModelCompositeModels: Option[List[_]] = None,
    assetModelHierarchies: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assetModelDescription: Option[String] = None,
    assetModelName: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps.Builder)
      .assetModelProperties(assetModelProperties.map(_.asJava).orNull)
      .assetModelCompositeModels(assetModelCompositeModels.map(_.asJava).orNull)
      .assetModelHierarchies(assetModelHierarchies.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .assetModelDescription(assetModelDescription.orNull)
      .assetModelName(assetModelName.orNull)
      .build()
}
