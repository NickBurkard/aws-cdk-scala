package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExpressionVariableProperty {

  def apply(
    name: String,
    value: software.amazon.awscdk.services.iotsitewise.CfnAssetModel.VariableValueProperty
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.ExpressionVariableProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
