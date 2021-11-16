package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEventSubscriptionProps {

  def apply(
    subscriptionName: String,
    sourceType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enabled: Option[Boolean] = None,
    eventCategories: Option[List[String]] = None,
    severity: Option[String] = None,
    snsTopicArn: Option[String] = None,
    sourceIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps =
    (new software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps.Builder)
      .subscriptionName(subscriptionName)
      .sourceType(sourceType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventCategories(eventCategories.map(_.asJava).orNull)
      .severity(severity.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .sourceIds(sourceIds.map(_.asJava).orNull)
      .build()
}
