package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VerificationMessageTemplateProperty {

  def apply(
    emailSubject: Option[String] = None,
    defaultEmailOption: Option[String] = None,
    emailSubjectByLink: Option[String] = None,
    smsMessage: Option[String] = None,
    emailMessage: Option[String] = None,
    emailMessageByLink: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.VerificationMessageTemplateProperty.Builder)
      .emailSubject(emailSubject.orNull)
      .defaultEmailOption(defaultEmailOption.orNull)
      .emailSubjectByLink(emailSubjectByLink.orNull)
      .smsMessage(smsMessage.orNull)
      .emailMessage(emailMessage.orNull)
      .emailMessageByLink(emailMessageByLink.orNull)
      .build()
}
