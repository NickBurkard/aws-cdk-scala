package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMemberProps {

  def apply(
    detectorId: Option[String] = None,
    email: Option[String] = None,
    disableEmailNotification: Option[Boolean] = None,
    status: Option[String] = None,
    message: Option[String] = None,
    memberId: Option[String] = None
  ): software.amazon.awscdk.services.guardduty.CfnMemberProps =
    (new software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder)
      .detectorId(detectorId.orNull)
      .email(email.orNull)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .status(status.orNull)
      .message(message.orNull)
      .memberId(memberId.orNull)
      .build()
}
