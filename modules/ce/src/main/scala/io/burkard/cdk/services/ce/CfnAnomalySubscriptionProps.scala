package io.burkard.cdk.services.ce

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalySubscriptionProps {

  def apply(
    monitorArnList: Option[List[String]] = None,
    subscribers: Option[List[_]] = None,
    subscriptionName: Option[String] = None,
    threshold: Option[Number] = None,
    frequency: Option[String] = None
  ): software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps =
    (new software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps.Builder)
      .monitorArnList(monitorArnList.map(_.asJava).orNull)
      .subscribers(subscribers.map(_.asJava).orNull)
      .subscriptionName(subscriptionName.orNull)
      .threshold(threshold.orNull)
      .frequency(frequency.orNull)
      .build()
}
