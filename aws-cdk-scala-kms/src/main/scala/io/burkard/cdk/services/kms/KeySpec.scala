package io.burkard.cdk.services.kms

sealed abstract class KeySpec(val underlying: software.amazon.awscdk.services.kms.KeySpec)
  extends Product
    with Serializable

object KeySpec {
  implicit def toAws(value: KeySpec): software.amazon.awscdk.services.kms.KeySpec =
    Option(value).map(_.underlying).orNull

  case object SymmetricDefault
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.SYMMETRIC_DEFAULT)

  case object Rsa2048
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.RSA_2048)

  case object Rsa3072
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.RSA_3072)

  case object Rsa4096
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.RSA_4096)

  case object EccNistP256
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P256)

  case object EccNistP384
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P384)

  case object EccNistP521
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.ECC_NIST_P521)

  case object EccSecgP256k1
    extends KeySpec(software.amazon.awscdk.services.kms.KeySpec.ECC_SECG_P256K1)
}
