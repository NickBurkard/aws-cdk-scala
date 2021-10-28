package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WorkmailActionConfig {

  def apply(
    topicArn: Option[String] = None,
    organizationArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.WorkmailActionConfig =
    (new software.amazon.awscdk.services.ses.WorkmailActionConfig.Builder)
      .topicArn(topicArn.orNull)
      .organizationArn(organizationArn.orNull)
      .build()
}
