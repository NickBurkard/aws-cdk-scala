package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNotificationRule {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    tags: Option[AnyRef] = None,
    eventTypeIds: Option[List[String]] = None,
    status: Option[String] = None,
    resource: Option[String] = None,
    detailType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
    software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .tags(tags.orNull)
      .eventTypeIds(eventTypeIds.map(_.asJava).orNull)
      .status(status.orNull)
      .resource(resource.orNull)
      .detailType(detailType.orNull)
      .build()
}
