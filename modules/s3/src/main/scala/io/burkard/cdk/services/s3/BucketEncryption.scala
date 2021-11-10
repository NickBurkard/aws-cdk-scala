package io.burkard.cdk.services.s3


sealed abstract class BucketEncryption(val underlying: software.amazon.awscdk.services.s3.BucketEncryption)
  extends Product
    with Serializable


object BucketEncryption {
  implicit def toAws(value: BucketEncryption): software.amazon.awscdk.services.s3.BucketEncryption =
    Option(value).map(_.underlying).orNull

  case object Unencrypted
    extends BucketEncryption(software.amazon.awscdk.services.s3.BucketEncryption.UNENCRYPTED)

  case object KmsManaged
    extends BucketEncryption(software.amazon.awscdk.services.s3.BucketEncryption.KMS_MANAGED)

  case object S3Managed
    extends BucketEncryption(software.amazon.awscdk.services.s3.BucketEncryption.S3_MANAGED)

  case object Kms
    extends BucketEncryption(software.amazon.awscdk.services.s3.BucketEncryption.KMS)
}
