package io.burkard.cdk.services.stepfunctions


sealed abstract class EncryptionOption(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption)
  extends Product
    with Serializable


object EncryptionOption {
  implicit def toAws(value: EncryptionOption): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption =
    Option(value).map(_.underlying).orNull

  case object S3Managed
    extends EncryptionOption(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.S3_MANAGED)

  case object Kms
    extends EncryptionOption(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.KMS)

  case object ClientSideKms
    extends EncryptionOption(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.CLIENT_SIDE_KMS)
}
