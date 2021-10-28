package io.burkard.cdk.services.ce

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalySubscription {

  def apply(
    internalResourceId: String,
    monitorArnList: Option[List[String]] = None,
    subscribers: Option[List[_]] = None,
    subscriptionName: Option[String] = None,
    threshold: Option[Number] = None,
    frequency: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ce.CfnAnomalySubscription =
    software.amazon.awscdk.services.ce.CfnAnomalySubscription.Builder
      .create(stackCtx, internalResourceId)
      .monitorArnList(monitorArnList.map(_.asJava).orNull)
      .subscribers(subscribers.map(_.asJava).orNull)
      .subscriptionName(subscriptionName.orNull)
      .threshold(threshold.orNull)
      .frequency(frequency.orNull)
      .build()
}
