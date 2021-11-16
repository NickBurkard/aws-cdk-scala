package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkmailActionConfig {

  def apply(
    organizationArn: String,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.WorkmailActionConfig =
    (new software.amazon.awscdk.services.ses.WorkmailActionConfig.Builder)
      .organizationArn(organizationArn)
      .topicArn(topicArn.orNull)
      .build()
}
