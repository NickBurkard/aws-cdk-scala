package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicProperty {

  def apply(
    displayName: String,
    defaultSubscriptionStatus: String,
    topicName: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnContactList.TopicProperty =
    (new software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.Builder)
      .displayName(displayName)
      .defaultSubscriptionStatus(defaultSubscriptionStatus)
      .topicName(topicName)
      .description(description.orNull)
      .build()
}
