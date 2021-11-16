package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubscriptionOptions {

  def apply(
    protocol: software.amazon.awscdk.services.sns.SubscriptionProtocol,
    endpoint: String,
    subscriptionRoleArn: Option[String] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.sns.SubscriptionOptions =
    (new software.amazon.awscdk.services.sns.SubscriptionOptions.Builder)
      .protocol(protocol)
      .endpoint(endpoint)
      .subscriptionRoleArn(subscriptionRoleArn.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .region(region.orNull)
      .build()
}
