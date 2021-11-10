package io.burkard.cdk.services.kinesis


sealed abstract class StreamEncryption(val underlying: software.amazon.awscdk.services.kinesis.StreamEncryption)
  extends Product
    with Serializable


object StreamEncryption {
  implicit def toAws(value: StreamEncryption): software.amazon.awscdk.services.kinesis.StreamEncryption =
    Option(value).map(_.underlying).orNull

  case object Unencrypted
    extends StreamEncryption(software.amazon.awscdk.services.kinesis.StreamEncryption.UNENCRYPTED)

  case object Kms
    extends StreamEncryption(software.amazon.awscdk.services.kinesis.StreamEncryption.KMS)

  case object Managed
    extends StreamEncryption(software.amazon.awscdk.services.kinesis.StreamEncryption.MANAGED)
}
