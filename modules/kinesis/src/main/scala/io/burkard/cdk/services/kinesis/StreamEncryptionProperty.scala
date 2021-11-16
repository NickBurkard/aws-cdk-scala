package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamEncryptionProperty {

  def apply(
    keyId: String,
    encryptionType: String
  ): software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty =
    (new software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty.Builder)
      .keyId(keyId)
      .encryptionType(encryptionType)
      .build()
}
