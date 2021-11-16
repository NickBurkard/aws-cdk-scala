package io.burkard.cdk.services.detective

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberInvitationProps {

  def apply(
    graphArn: String,
    memberEmailAddress: String,
    memberId: String,
    disableEmailNotification: Option[Boolean] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.detective.CfnMemberInvitationProps =
    (new software.amazon.awscdk.services.detective.CfnMemberInvitationProps.Builder)
      .graphArn(graphArn)
      .memberEmailAddress(memberEmailAddress)
      .memberId(memberId)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .message(message.orNull)
      .build()
}
