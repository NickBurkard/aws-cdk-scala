package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CoordinatesProperty {

  def apply(
    latitude: Option[Number] = None,
    longitude: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.Builder)
      .latitude(latitude.orNull)
      .longitude(longitude.orNull)
      .build()
}
