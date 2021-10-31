package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SmsSubscription {

  def apply(
    phoneNumber: String,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.SmsSubscription =
    software.amazon.awscdk.services.sns.subscriptions.SmsSubscription.Builder
      .create(phoneNumber)
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
