package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProvisionalConfigurationProperty {

  def apply(
    maxTimeToLiveInMinutes: Number
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty.Builder)
      .maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
      .build()
}
