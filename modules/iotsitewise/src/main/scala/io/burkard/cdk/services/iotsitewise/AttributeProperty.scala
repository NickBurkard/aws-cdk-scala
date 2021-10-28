package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AttributeProperty {

  def apply(
    defaultValue: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAssetModel.AttributeProperty.Builder)
      .defaultValue(defaultValue.orNull)
      .build()
}
