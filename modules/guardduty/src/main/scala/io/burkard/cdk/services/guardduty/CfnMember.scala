package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMember {

  def apply(
    internalResourceId: String,
    detectorId: Option[String] = None,
    email: Option[String] = None,
    disableEmailNotification: Option[Boolean] = None,
    status: Option[String] = None,
    message: Option[String] = None,
    memberId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnMember =
    software.amazon.awscdk.services.guardduty.CfnMember.Builder
      .create(stackCtx, internalResourceId)
      .detectorId(detectorId.orNull)
      .email(email.orNull)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .status(status.orNull)
      .message(message.orNull)
      .memberId(memberId.orNull)
      .build()
}
