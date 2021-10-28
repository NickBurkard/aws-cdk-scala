package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriptionProperty {

  def apply(
    endpoint: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty =
    (new software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder)
      .endpoint(endpoint.orNull)
      .protocol(protocol.orNull)
      .build()
}
