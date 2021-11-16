package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetModelCompositeModelProperty {

  def apply(
    name: String,
    `type`: String,
    compositeModelProperties: Option[List[_]] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelCompositeModelProperty.Builder)
      .name(name)
      .`type`(`type`)
      .compositeModelProperties(compositeModelProperties.map(_.asJava).orNull)
      .description(description.orNull)
      .build()
}
