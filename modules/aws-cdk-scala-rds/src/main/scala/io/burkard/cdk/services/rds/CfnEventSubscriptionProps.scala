package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEventSubscriptionProps {

  def apply(
    sourceType: Option[String] = None,
    enabled: Option[Boolean] = None,
    sourceIds: Option[List[String]] = None,
    eventCategories: Option[List[String]] = None,
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnEventSubscriptionProps =
    (new software.amazon.awscdk.services.rds.CfnEventSubscriptionProps.Builder)
      .sourceType(sourceType.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceIds(sourceIds.map(_.asJava).orNull)
      .eventCategories(eventCategories.map(_.asJava).orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
