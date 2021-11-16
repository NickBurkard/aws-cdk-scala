package io.burkard.cdk.services.detective

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMemberInvitation {

  def apply(
    internalResourceId: String,
    graphArn: String,
    memberEmailAddress: String,
    memberId: String,
    disableEmailNotification: Option[Boolean] = None,
    message: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.detective.CfnMemberInvitation =
    software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder
      .create(stackCtx, internalResourceId)
      .graphArn(graphArn)
      .memberEmailAddress(memberEmailAddress)
      .memberId(memberId)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .message(message.orNull)
      .build()
}
