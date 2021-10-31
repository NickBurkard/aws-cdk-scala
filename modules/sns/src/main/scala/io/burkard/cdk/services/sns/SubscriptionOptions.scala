package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubscriptionOptions {

  def apply(
    subscriptionRoleArn: Option[String] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None,
    region: Option[String] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.sns.SubscriptionOptions =
    (new software.amazon.awscdk.services.sns.SubscriptionOptions.Builder)
      .subscriptionRoleArn(subscriptionRoleArn.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .region(region.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
