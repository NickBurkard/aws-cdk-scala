package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventSubscriptionProps {

  def apply(
    snsTopicArn: String,
    sourceType: Option[String] = None,
    enabled: Option[Boolean] = None,
    sourceIds: Option[List[String]] = None,
    eventCategories: Option[List[String]] = None
  ): software.amazon.awscdk.services.rds.CfnEventSubscriptionProps =
    (new software.amazon.awscdk.services.rds.CfnEventSubscriptionProps.Builder)
      .snsTopicArn(snsTopicArn)
      .sourceType(sourceType.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceIds(sourceIds.map(_.asJava).orNull)
      .eventCategories(eventCategories.map(_.asJava).orNull)
      .build()
}
