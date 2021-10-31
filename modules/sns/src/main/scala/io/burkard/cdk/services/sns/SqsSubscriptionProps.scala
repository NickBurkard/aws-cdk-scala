package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsSubscriptionProps {

  def apply(
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps =
    (new software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps.Builder)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
