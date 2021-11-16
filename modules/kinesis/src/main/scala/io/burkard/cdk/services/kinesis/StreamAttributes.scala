package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamAttributes {

  def apply(
    streamArn: String,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.kinesis.StreamAttributes =
    (new software.amazon.awscdk.services.kinesis.StreamAttributes.Builder)
      .streamArn(streamArn)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
