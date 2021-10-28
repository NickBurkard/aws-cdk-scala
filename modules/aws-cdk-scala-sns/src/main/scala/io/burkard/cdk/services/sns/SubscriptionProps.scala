package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriptionProps {

  def apply(
    subscriptionRoleArn: Option[String] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None,
    region: Option[String] = None,
    endpoint: Option[String] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.SubscriptionProps =
    (new software.amazon.awscdk.services.sns.SubscriptionProps.Builder)
      .subscriptionRoleArn(subscriptionRoleArn.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .protocol(protocol.orNull)
      .region(region.orNull)
      .endpoint(endpoint.orNull)
      .topic(topic.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
