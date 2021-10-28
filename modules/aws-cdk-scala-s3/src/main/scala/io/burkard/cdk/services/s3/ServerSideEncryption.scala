package io.burkard.cdk.services.s3

sealed abstract class ServerSideEncryption(val underlying: software.amazon.awscdk.services.s3.deployment.ServerSideEncryption)
  extends Product
    with Serializable

object ServerSideEncryption {
  implicit def toAws(value: ServerSideEncryption): software.amazon.awscdk.services.s3.deployment.ServerSideEncryption =
    Option(value).map(_.underlying).orNull

  case object Aes256
    extends ServerSideEncryption(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AES_256)

  case object AwsKms
    extends ServerSideEncryption(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS)
}
