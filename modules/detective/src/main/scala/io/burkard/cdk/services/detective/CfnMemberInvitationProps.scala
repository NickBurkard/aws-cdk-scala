package io.burkard.cdk.services.detective

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberInvitationProps {

  def apply(
    graphArn: Option[String] = None,
    disableEmailNotification: Option[Boolean] = None,
    memberEmailAddress: Option[String] = None,
    message: Option[String] = None,
    memberId: Option[String] = None
  ): software.amazon.awscdk.services.detective.CfnMemberInvitationProps =
    (new software.amazon.awscdk.services.detective.CfnMemberInvitationProps.Builder)
      .graphArn(graphArn.orNull)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .memberEmailAddress(memberEmailAddress.orNull)
      .message(message.orNull)
      .memberId(memberId.orNull)
      .build()
}
