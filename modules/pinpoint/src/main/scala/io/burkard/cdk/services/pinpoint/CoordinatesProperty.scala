package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CoordinatesProperty {

  def apply(
    latitude: Number,
    longitude: Number
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty.Builder)
      .latitude(latitude)
      .longitude(longitude)
      .build()
}
