package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MailFromAttributesProperty {

  def apply(
    mailFromDomain: Option[String] = None,
    behaviorOnMxFailure: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnIdentity.MailFromAttributesProperty.Builder)
      .mailFromDomain(mailFromDomain.orNull)
      .behaviorOnMxFailure(behaviorOnMxFailure.orNull)
      .build()
}
