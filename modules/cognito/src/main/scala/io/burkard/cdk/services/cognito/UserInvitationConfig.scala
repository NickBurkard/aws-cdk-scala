package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserInvitationConfig {

  def apply(
    emailBody: Option[String] = None,
    emailSubject: Option[String] = None,
    smsMessage: Option[String] = None
  ): software.amazon.awscdk.services.cognito.UserInvitationConfig =
    (new software.amazon.awscdk.services.cognito.UserInvitationConfig.Builder)
      .emailBody(emailBody.orNull)
      .emailSubject(emailSubject.orNull)
      .smsMessage(smsMessage.orNull)
      .build()
}
