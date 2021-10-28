package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AssetPropertyValueProperty {

  def apply(
    quality: Option[String] = None,
    timestamp: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyTimestampProperty] = None,
    value: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyVariantProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.AssetPropertyValueProperty.Builder)
      .quality(quality.orNull)
      .timestamp(timestamp.orNull)
      .value(value.orNull)
      .build()
}
