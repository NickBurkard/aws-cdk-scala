package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LicenseSpecificationProperty {

  def apply(
    licenseConfigurationArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.LicenseSpecificationProperty.Builder)
      .licenseConfigurationArn(licenseConfigurationArn.orNull)
      .build()
}
