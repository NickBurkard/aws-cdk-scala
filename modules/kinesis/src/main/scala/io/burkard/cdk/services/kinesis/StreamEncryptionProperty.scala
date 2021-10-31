package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamEncryptionProperty {

  def apply(
    keyId: Option[String] = None,
    encryptionType: Option[String] = None
  ): software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty =
    (new software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder)
      .keyId(keyId.orNull)
      .encryptionType(encryptionType.orNull)
      .build()
}
