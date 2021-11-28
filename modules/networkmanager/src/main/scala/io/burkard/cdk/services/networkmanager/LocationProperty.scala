package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocationProperty {

  def apply(
    latitude: Option[String] = None,
    longitude: Option[String] = None,
    address: Option[String] = None
  ): software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty =
    (new software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty.Builder)
      .latitude(latitude.orNull)
      .longitude(longitude.orNull)
      .address(address.orNull)
      .build()
}
