package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SmsSubscriptionProps {

  def apply(
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps =
    (new software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps.Builder)
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
