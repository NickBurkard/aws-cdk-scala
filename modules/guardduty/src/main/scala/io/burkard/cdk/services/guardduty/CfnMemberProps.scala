package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberProps {

  def apply(
    detectorId: String,
    email: String,
    memberId: String,
    disableEmailNotification: Option[Boolean] = None,
    status: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.guardduty.CfnMemberProps =
    (new software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder)
      .detectorId(detectorId)
      .email(email)
      .memberId(memberId)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .status(status.orNull)
      .message(message.orNull)
      .build()
}
