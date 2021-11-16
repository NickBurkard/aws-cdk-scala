package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionProperty {

  def apply(
    endpoint: String,
    protocol: String
  ): software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty =
    (new software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder)
      .endpoint(endpoint)
      .protocol(protocol)
      .build()
}
