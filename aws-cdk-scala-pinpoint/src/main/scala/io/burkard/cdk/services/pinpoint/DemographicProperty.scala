package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DemographicProperty {

  def apply(
    channel: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    model: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    appVersion: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    deviceType: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    make: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None,
    platform: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SetDimensionProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty.Builder)
      .channel(channel.orNull)
      .model(model.orNull)
      .appVersion(appVersion.orNull)
      .deviceType(deviceType.orNull)
      .make(make.orNull)
      .platform(platform.orNull)
      .build()
}
