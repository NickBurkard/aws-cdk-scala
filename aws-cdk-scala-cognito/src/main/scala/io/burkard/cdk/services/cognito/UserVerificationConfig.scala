package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserVerificationConfig {

  def apply(
    emailBody: Option[String] = None,
    emailSubject: Option[String] = None,
    smsMessage: Option[String] = None,
    emailStyle: Option[software.amazon.awscdk.services.cognito.VerificationEmailStyle] = None
  ): software.amazon.awscdk.services.cognito.UserVerificationConfig =
    (new software.amazon.awscdk.services.cognito.UserVerificationConfig.Builder)
      .emailBody(emailBody.orNull)
      .emailSubject(emailSubject.orNull)
      .smsMessage(smsMessage.orNull)
      .emailStyle(emailStyle.orNull)
      .build()
}
