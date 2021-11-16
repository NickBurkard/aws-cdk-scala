package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BorrowConfigurationProperty {

  def apply(
    allowEarlyCheckIn: Boolean,
    maxTimeToLiveInMinutes: Number
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty.Builder)
      .allowEarlyCheckIn(allowEarlyCheckIn)
      .maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
      .build()
}
