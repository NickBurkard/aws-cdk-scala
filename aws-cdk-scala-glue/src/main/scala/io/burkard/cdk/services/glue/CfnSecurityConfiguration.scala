package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityConfiguration {

  def apply(
    internalResourceId: String,
    encryptionConfiguration: Option[software.amazon.awscdk.services.glue.CfnSecurityConfiguration.EncryptionConfigurationProperty] = None,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnSecurityConfiguration =
    software.amazon.awscdk.services.glue.CfnSecurityConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .name(name.orNull)
      .build()
}
