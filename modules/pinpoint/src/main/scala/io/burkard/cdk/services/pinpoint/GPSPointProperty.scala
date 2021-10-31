package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GPSPointProperty {

  def apply(
    coordinates: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.CoordinatesProperty] = None,
    rangeInKilometers: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.GPSPointProperty.Builder)
      .coordinates(coordinates.orNull)
      .rangeInKilometers(rangeInKilometers.orNull)
      .build()
}
