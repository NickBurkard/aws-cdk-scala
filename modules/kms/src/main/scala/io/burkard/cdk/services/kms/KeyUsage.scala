package io.burkard.cdk.services.kms


sealed abstract class KeyUsage(val underlying: software.amazon.awscdk.services.kms.KeyUsage)
  extends Product
    with Serializable


object KeyUsage {
  implicit def toAws(value: KeyUsage): software.amazon.awscdk.services.kms.KeyUsage =
    Option(value).map(_.underlying).orNull

  case object EncryptDecrypt
    extends KeyUsage(software.amazon.awscdk.services.kms.KeyUsage.ENCRYPT_DECRYPT)

  case object SignVerify
    extends KeyUsage(software.amazon.awscdk.services.kms.KeyUsage.SIGN_VERIFY)
}
