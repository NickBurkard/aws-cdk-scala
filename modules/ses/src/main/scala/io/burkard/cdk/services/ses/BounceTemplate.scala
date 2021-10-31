package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceTemplate {

  def apply(
    statusCode: Option[String] = None,
    smtpReplyCode: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.BounceTemplate =
    software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder
      .create()
      .statusCode(statusCode.orNull)
      .smtpReplyCode(smtpReplyCode.orNull)
      .message(message.orNull)
      .build()
}
