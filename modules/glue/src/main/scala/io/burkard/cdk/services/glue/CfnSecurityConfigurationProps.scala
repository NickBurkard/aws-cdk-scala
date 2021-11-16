package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfigurationProps {

  def apply(
    encryptionConfiguration: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty,
    name: String
  ): software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps =
    (new software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.Builder)
      .encryptionConfiguration(encryptionConfiguration)
      .name(name)
      .build()
}
