package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
