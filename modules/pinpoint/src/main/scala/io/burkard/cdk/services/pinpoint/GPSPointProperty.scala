package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GPSPointProperty {

  def apply(
    coordinates: software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty,
    rangeInKilometers: Number
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.Builder)
      .coordinates(coordinates)
      .rangeInKilometers(rangeInKilometers)
      .build()
}
