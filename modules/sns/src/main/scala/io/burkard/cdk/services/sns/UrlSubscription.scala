package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UrlSubscription {

  def apply(
    url: String,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    rawMessageDelivery: Option[Boolean] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None,
    protocol: Option[software.amazon.awscdk.services.sns.SubscriptionProtocol] = None
  ): software.amazon.awscdk.services.sns.subscriptions.UrlSubscription =
    software.amazon.awscdk.services.sns.subscriptions.UrlSubscription.Builder
      .create(url)
      .deadLetterQueue(deadLetterQueue.orNull)
      .rawMessageDelivery(rawMessageDelivery.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .build()
}
