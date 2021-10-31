package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationRuleProps {

  def apply(
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    tags: Option[AnyRef] = None,
    eventTypeIds: Option[List[String]] = None,
    status: Option[String] = None,
    resource: Option[String] = None,
    detailType: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps =
    (new software.amazon.awscdk.services.codestarnotifications.CfnNotificationRuleProps.Builder)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .tags(tags.orNull)
      .eventTypeIds(eventTypeIds.map(_.asJava).orNull)
      .status(status.orNull)
      .resource(resource.orNull)
      .detailType(detailType.orNull)
      .build()
}
