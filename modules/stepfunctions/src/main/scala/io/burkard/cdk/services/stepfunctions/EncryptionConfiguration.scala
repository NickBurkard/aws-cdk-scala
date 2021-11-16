package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionConfiguration {

  def apply(
    encryptionOption: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.Builder)
      .encryptionOption(encryptionOption)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
