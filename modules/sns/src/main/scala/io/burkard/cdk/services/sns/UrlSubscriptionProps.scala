package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UrlSubscriptionProps {

  def apply(
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None
  ): software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps =
    (new software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps.Builder)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
