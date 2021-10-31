package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LicenseServiceConfigurationProperty {

  def apply(
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty.Builder)
      .endpoint(endpoint.orNull)
      .build()
}
