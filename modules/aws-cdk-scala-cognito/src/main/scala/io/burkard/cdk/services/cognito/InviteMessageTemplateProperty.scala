package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InviteMessageTemplateProperty {

  def apply(
    emailSubject: Option[String] = None,
    smsMessage: Option[String] = None,
    emailMessage: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty.Builder)
      .emailSubject(emailSubject.orNull)
      .smsMessage(smsMessage.orNull)
      .emailMessage(emailMessage.orNull)
      .build()
}
