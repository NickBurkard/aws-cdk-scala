package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmailSubscription {

  def apply(
    emailAddress: String,
    json: Option[Boolean] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.EmailSubscription =
    software.amazon.awscdk.services.sns.subscriptions.EmailSubscription.Builder
      .create(emailAddress)
      .json(json.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
