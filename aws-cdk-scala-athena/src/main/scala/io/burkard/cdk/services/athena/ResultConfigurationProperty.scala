package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResultConfigurationProperty {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty] = None,
    outputLocation: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .outputLocation(outputLocation.orNull)
      .build()
}
