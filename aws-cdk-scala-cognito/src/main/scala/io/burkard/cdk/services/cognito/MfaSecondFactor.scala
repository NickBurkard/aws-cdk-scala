package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MfaSecondFactor {

  def apply(
    sms: Option[Boolean] = None,
    otp: Option[Boolean] = None
  ): software.amazon.awscdk.services.cognito.MfaSecondFactor =
    (new software.amazon.awscdk.services.cognito.MfaSecondFactor.Builder)
      .sms(sms.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .otp(otp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
