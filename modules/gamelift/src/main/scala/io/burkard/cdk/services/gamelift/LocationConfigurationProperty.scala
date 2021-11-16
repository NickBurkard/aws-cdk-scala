package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocationConfigurationProperty {

  def apply(
    location: String,
    locationCapacity: Option[software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.Builder)
      .location(location)
      .locationCapacity(locationCapacity.orNull)
      .build()
}
