package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetModelPropertyProperty {

  def apply(
    name: Option[String] = None,
    dataTypeSpec: Option[String] = None,
    unit: Option[String] = None,
    logicalId: Option[String] = None,
    dataType: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.PropertyTypeProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AssetModelPropertyProperty.Builder)
      .name(name.orNull)
      .dataTypeSpec(dataTypeSpec.orNull)
      .unit(unit.orNull)
      .logicalId(logicalId.orNull)
      .dataType(dataType.orNull)
      .`type`(`type`.orNull)
      .build()
}
