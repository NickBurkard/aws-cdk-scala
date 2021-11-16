package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    encryptionOption: String,
    kmsKey: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.Builder)
      .encryptionOption(encryptionOption)
      .kmsKey(kmsKey.orNull)
      .build()
}
