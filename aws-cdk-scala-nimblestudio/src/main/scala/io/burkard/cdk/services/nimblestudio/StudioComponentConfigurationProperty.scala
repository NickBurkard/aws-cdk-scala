package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StudioComponentConfigurationProperty {

  def apply(
    sharedFileSystemConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty] = None,
    licenseServiceConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.LicenseServiceConfigurationProperty] = None,
    computeFarmConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty] = None,
    activeDirectoryConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ActiveDirectoryConfigurationProperty] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty.Builder)
      .sharedFileSystemConfiguration(sharedFileSystemConfiguration.orNull)
      .licenseServiceConfiguration(licenseServiceConfiguration.orNull)
      .computeFarmConfiguration(computeFarmConfiguration.orNull)
      .activeDirectoryConfiguration(activeDirectoryConfiguration.orNull)
      .build()
}
