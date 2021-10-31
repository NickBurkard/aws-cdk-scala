package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfigurationProperty {

  def apply(
    kmsKey: Option[String] = None,
    encryptionType: Option[String] = None
  ): software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty =
    (new software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty.Builder)
      .kmsKey(kmsKey.orNull)
      .encryptionType(encryptionType.orNull)
      .build()
}
