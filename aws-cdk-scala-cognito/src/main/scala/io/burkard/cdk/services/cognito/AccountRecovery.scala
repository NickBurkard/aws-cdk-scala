package io.burkard.cdk.services.cognito

sealed abstract class AccountRecovery(val underlying: software.amazon.awscdk.services.cognito.AccountRecovery)
  extends Product
    with Serializable

object AccountRecovery {
  implicit def toAws(value: AccountRecovery): software.amazon.awscdk.services.cognito.AccountRecovery =
    Option(value).map(_.underlying).orNull

  case object EmailAndPhoneWithoutMfa
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.EMAIL_AND_PHONE_WITHOUT_MFA)

  case object PhoneWithoutMfaAndEmail
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_WITHOUT_MFA_AND_EMAIL)

  case object EmailOnly
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.EMAIL_ONLY)

  case object PhoneOnlyWithoutMfa
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_ONLY_WITHOUT_MFA)

  case object PhoneAndEmail
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.PHONE_AND_EMAIL)

  case object None
    extends AccountRecovery(software.amazon.awscdk.services.cognito.AccountRecovery.NONE)
}
