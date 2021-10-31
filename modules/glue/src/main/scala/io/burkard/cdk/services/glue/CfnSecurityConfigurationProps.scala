package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfigurationProps {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .name(name.orNull)
      .build()
}
