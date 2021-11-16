package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MfaSecondFactor {

  def apply(
    sms: Boolean,
    otp: Boolean
  ): software.amazon.awscdk.services.cognito.MfaSecondFactor =
    (new software.amazon.awscdk.services.cognito.MfaSecondFactor.Builder)
      .sms(sms)
      .otp(otp)
      .build()
}
