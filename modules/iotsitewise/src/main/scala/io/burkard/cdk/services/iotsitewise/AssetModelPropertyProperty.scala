package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetModelPropertyProperty {

  def apply(
    name: String,
    logicalId: String,
    dataType: String,
    `type`: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty,
    dataTypeSpec: Option[String] = None,
    unit: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.Builder)
      .name(name)
      .logicalId(logicalId)
      .dataType(dataType)
      .`type`(`type`)
      .dataTypeSpec(dataTypeSpec.orNull)
      .unit(unit.orNull)
      .build()
}
