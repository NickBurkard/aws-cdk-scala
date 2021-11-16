package io.burkard.cdk.services.ce

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalySubscription {

  def apply(
    internalResourceId: String,
    monitorArnList: List[String],
    subscribers: List[_],
    subscriptionName: String,
    threshold: Number,
    frequency: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnAnomalySubscription =
    software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder
      .create(stackCtx, internalResourceId)
      .monitorArnList(monitorArnList.asJava)
      .subscribers(subscribers.asJava)
      .subscriptionName(subscriptionName)
      .threshold(threshold)
      .frequency(frequency)
      .build()
}
