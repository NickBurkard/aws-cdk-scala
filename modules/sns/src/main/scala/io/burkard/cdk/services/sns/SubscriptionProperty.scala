package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
