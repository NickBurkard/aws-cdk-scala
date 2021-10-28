package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProvisionalConfigurationProperty {

  def apply(
    maxTimeToLiveInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty.Builder)
      .maxTimeToLiveInMinutes(maxTimeToLiveInMinutes.orNull)
      .build()
}
