package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VariableValueProperty {

  def apply(
    propertyLogicalId: Option[String] = None,
    hierarchyLogicalId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.Builder)
      .propertyLogicalId(propertyLogicalId.orNull)
      .hierarchyLogicalId(hierarchyLogicalId.orNull)
      .build()
}
