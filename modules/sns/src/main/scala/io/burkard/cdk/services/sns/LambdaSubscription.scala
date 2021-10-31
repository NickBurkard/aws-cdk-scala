package io.burkard.cdk.services.sns

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaSubscription {

  def apply(
    fn: software.amazon.awscdk.services.lambda.IFunction,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription =
    software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription.Builder
      .create(fn)
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
