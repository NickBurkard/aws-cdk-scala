package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BorrowConfigurationProperty {

  def apply(
    allowEarlyCheckIn: Option[Boolean] = None,
    maxTimeToLiveInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty.Builder)
      .allowEarlyCheckIn(allowEarlyCheckIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxTimeToLiveInMinutes(maxTimeToLiveInMinutes.orNull)
      .build()
}
