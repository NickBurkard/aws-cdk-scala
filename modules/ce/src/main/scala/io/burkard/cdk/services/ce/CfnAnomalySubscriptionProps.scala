package io.burkard.cdk.services.ce

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalySubscriptionProps {

  def apply(
    monitorArnList: List[String],
    subscribers: List[_],
    subscriptionName: String,
    threshold: Number,
    frequency: String
  ): software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps =
    (new software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.Builder)
      .monitorArnList(monitorArnList.asJava)
      .subscribers(subscribers.asJava)
      .subscriptionName(subscriptionName)
      .threshold(threshold)
      .frequency(frequency)
      .build()
}
