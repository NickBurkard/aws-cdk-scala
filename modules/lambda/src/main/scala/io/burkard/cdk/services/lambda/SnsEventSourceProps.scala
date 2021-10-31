package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnsEventSourceProps {

  def apply(
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    filterPolicy: Option[Map[String, _ <: software.amazon.awscdk.services.sns.SubscriptionFilter]] = None
  ): software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps =
    (new software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps.Builder)
      .deadLetterQueue(deadLetterQueue.orNull)
      .filterPolicy(filterPolicy.map(_.asJava).orNull)
      .build()
}
