package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityConfiguration {

  def apply(
    internalResourceId: String,
    encryptionConfiguration: software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty,
    name: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSecurityConfiguration =
    software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .encryptionConfiguration(encryptionConfiguration)
      .name(name)
      .build()
}
