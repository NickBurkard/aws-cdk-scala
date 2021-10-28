package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BounceTemplateProps {

  def apply(
    statusCode: Option[String] = None,
    smtpReplyCode: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.BounceTemplateProps =
    (new software.amazon.awscdk.services.ses.actions.BounceTemplateProps.Builder)
      .statusCode(statusCode.orNull)
      .smtpReplyCode(smtpReplyCode.orNull)
      .message(message.orNull)
      .build()
}
