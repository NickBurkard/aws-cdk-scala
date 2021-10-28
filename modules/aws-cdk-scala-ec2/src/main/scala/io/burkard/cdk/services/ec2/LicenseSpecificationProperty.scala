package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LicenseSpecificationProperty {

  def apply(
    licenseConfigurationArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty.Builder)
      .licenseConfigurationArn(licenseConfigurationArn.orNull)
      .build()
}
