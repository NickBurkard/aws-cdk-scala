package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributeProperty {

  def apply(
    defaultValue: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.Builder)
      .defaultValue(defaultValue.orNull)
      .build()
}
