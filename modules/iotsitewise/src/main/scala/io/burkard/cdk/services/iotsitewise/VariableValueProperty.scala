package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VariableValueProperty {

  def apply(
    propertyLogicalId: String,
    hierarchyLogicalId: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty.Builder)
      .propertyLogicalId(propertyLogicalId)
      .hierarchyLogicalId(hierarchyLogicalId.orNull)
      .build()
}
