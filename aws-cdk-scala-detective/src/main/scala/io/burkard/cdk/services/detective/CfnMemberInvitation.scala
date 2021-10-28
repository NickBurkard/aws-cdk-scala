package io.burkard.cdk.services.detective

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMemberInvitation {

  def apply(
    internalResourceId: String,
    graphArn: Option[String] = None,
    disableEmailNotification: Option[Boolean] = None,
    memberEmailAddress: Option[String] = None,
    message: Option[String] = None,
    memberId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.detective.CfnMemberInvitation =
    software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder
      .create(stackCtx, internalResourceId)
      .graphArn(graphArn.orNull)
      .disableEmailNotification(disableEmailNotification.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .memberEmailAddress(memberEmailAddress.orNull)
      .message(message.orNull)
      .memberId(memberId.orNull)
      .build()
}
