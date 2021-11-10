package io.burkard.cdk.services.sqs


sealed abstract class QueueEncryption(val underlying: software.amazon.awscdk.services.sqs.QueueEncryption)
  extends Product
    with Serializable


object QueueEncryption {
  implicit def toAws(value: QueueEncryption): software.amazon.awscdk.services.sqs.QueueEncryption =
    Option(value).map(_.underlying).orNull

  case object Unencrypted
    extends QueueEncryption(software.amazon.awscdk.services.sqs.QueueEncryption.UNENCRYPTED)

  case object KmsManaged
    extends QueueEncryption(software.amazon.awscdk.services.sqs.QueueEncryption.KMS_MANAGED)

  case object Kms
    extends QueueEncryption(software.amazon.awscdk.services.sqs.QueueEncryption.KMS)
}
