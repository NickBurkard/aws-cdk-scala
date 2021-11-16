package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceTemplate {

  def apply(
    smtpReplyCode: String,
    message: String,
    statusCode: Option[String] = None
  ): software.amazon.awscdk.services.ses.actions.BounceTemplate =
    software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder
      .create()
      .smtpReplyCode(smtpReplyCode)
      .message(message)
      .statusCode(statusCode.orNull)
      .build()
}
