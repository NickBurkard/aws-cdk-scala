package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmailSubscriptionProps {

  def apply(
    json: Option[Boolean] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps =
    (new software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps.Builder)
      .json(json.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
