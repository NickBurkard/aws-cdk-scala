package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LicenseServiceConfigurationProperty {

  def apply(
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.Builder)
      .endpoint(endpoint.orNull)
      .build()
}
