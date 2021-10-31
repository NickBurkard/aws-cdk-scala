package io.burkard.cdk.services.sns

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubscriptionProps {

  def apply(
    subscriptionRoleArn: Option[String] = None,
    deliveryPolicy: Option[AnyRef] = None,
    topicArn: Option[String] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[AnyRef] = None,
    redrivePolicy: Option[AnyRef] = None,
    protocol: Option[String] = None,
    region: Option[String] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.sns.CfnSubscriptionProps =
    (new software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder)
      .subscriptionRoleArn(subscriptionRoleArn.orNull)
      .deliveryPolicy(deliveryPolicy.orNull)
      .topicArn(topicArn.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.orNull)
      .redrivePolicy(redrivePolicy.orNull)
      .protocol(protocol.orNull)
      .region(region.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
