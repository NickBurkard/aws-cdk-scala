package io.burkard.cdk.services.licensemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConsumptionConfigurationProperty {

  def apply(
    renewType: Option[String] = None,
    borrowConfiguration: Option[software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty] = None,
    provisionalConfiguration: Option[software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty] = None
  ): software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty =
    (new software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty.Builder)
      .renewType(renewType.orNull)
      .borrowConfiguration(borrowConfiguration.orNull)
      .provisionalConfiguration(provisionalConfiguration.orNull)
      .build()
}
