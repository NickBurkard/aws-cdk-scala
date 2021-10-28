package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionConfiguration {

  def apply(
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    encryptionOption: Option[software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.Builder)
      .encryptionKey(encryptionKey.orNull)
      .encryptionOption(encryptionOption.orNull)
      .build()
}
