package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicProperty {

  def apply(
    displayName: Option[String] = None,
    defaultSubscriptionStatus: Option[String] = None,
    description: Option[String] = None,
    topicName: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnContactList.TopicProperty =
    (new software.amazon.awscdk.services.ses.CfnContactList.TopicProperty.Builder)
      .displayName(displayName.orNull)
      .defaultSubscriptionStatus(defaultSubscriptionStatus.orNull)
      .description(description.orNull)
      .topicName(topicName.orNull)
      .build()
}
