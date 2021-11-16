package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceTemplateProps {

  def apply(
    smtpReplyCode: String,
    message: String,
    statusCode: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.BounceTemplateProps =
    (new software.amazon.awscdk.services.ses.actions.BounceTemplateProps.Builder)
      .smtpReplyCode(smtpReplyCode)
      .message(message)
      .statusCode(statusCode.orNull)
      .build()
}
