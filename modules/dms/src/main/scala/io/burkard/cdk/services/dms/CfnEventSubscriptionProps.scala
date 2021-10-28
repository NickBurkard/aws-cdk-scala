package io.burkard.cdk.services.dms

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventSubscriptionProps {

  def apply(
    sourceType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    eventCategories: Option[List[String]] = None,
    snsTopicArn: Option[String] = None,
    sourceIds: Option[List[String]] = None,
    subscriptionName: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEventSubscriptionProps =
    (new software.amazon.awscdk.services.dms.CfnEventSubscriptionProps.Builder)
      .sourceType(sourceType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventCategories(eventCategories.map(_.asJava).orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .sourceIds(sourceIds.map(_.asJava).orNull)
      .subscriptionName(subscriptionName.orNull)
      .build()
}