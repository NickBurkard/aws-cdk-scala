package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetPropertyValueProperty {

  def apply(
    value: software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty,
    quality: Option[String] = None,
    timestamp: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.Builder)
      .value(value)
      .quality(quality.orNull)
      .timestamp(timestamp.orNull)
      .build()
}
