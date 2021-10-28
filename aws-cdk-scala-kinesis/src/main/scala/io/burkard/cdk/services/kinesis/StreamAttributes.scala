package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamAttributes {

  def apply(
    streamArn: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.kinesis.StreamAttributes =
    (new software.amazon.awscdk.services.kinesis.StreamAttributes.Builder)
      .streamArn(streamArn.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
