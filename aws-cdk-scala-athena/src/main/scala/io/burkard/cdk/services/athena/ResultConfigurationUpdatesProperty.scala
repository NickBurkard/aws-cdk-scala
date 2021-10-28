package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResultConfigurationUpdatesProperty {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty] = None,
    outputLocation: Option[String] = None,
    removeOutputLocation: Option[Boolean] = None,
    removeEncryptionConfiguration: Option[Boolean] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .outputLocation(outputLocation.orNull)
      .removeOutputLocation(removeOutputLocation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removeEncryptionConfiguration(removeEncryptionConfiguration.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
