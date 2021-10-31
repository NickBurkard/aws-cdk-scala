package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExpressionVariableProperty {

  def apply(
    name: Option[String] = None,
    value: Option[software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
