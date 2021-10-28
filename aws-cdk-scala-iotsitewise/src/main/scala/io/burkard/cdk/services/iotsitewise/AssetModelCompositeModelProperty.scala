package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetModelCompositeModelProperty {

  def apply(
    name: Option[String] = None,
    compositeModelProperties: Option[List[_]] = None,
    description: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.Builder)
      .name(name.orNull)
      .compositeModelProperties(compositeModelProperties.map(_.asJava).orNull)
      .description(description.orNull)
      .`type`(`type`.orNull)
      .build()
}
