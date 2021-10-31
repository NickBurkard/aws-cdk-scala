package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamProps {

  def apply(
    retentionPeriod: Option[software.amazon.awscdk.Duration] = None,
    encryption: Option[software.amazon.awscdk.services.kinesis.StreamEncryption] = None,
    shardCount: Option[Number] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.kinesis.StreamProps =
    (new software.amazon.awscdk.services.kinesis.StreamProps.Builder)
      .retentionPeriod(retentionPeriod.orNull)
      .encryption(encryption.orNull)
      .shardCount(shardCount.orNull)
      .encryptionKey(encryptionKey.orNull)
      .streamName(streamName.orNull)
      .build()
}
