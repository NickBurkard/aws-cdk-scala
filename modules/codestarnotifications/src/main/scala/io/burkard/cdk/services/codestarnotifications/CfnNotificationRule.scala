package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationRule {

  def apply(
    internalResourceId: String,
    targetAddress: Option[String] = None,
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    tags: Option[AnyRef] = None,
    eventTypeId: Option[String] = None,
    eventTypeIds: Option[List[String]] = None,
    status: Option[String] = None,
    createdBy: Option[String] = None,
    resource: Option[String] = None,
    detailType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
    software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder
      .create(stackCtx, internalResourceId)
      .targetAddress(targetAddress.orNull)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .tags(tags.orNull)
      .eventTypeId(eventTypeId.orNull)
      .eventTypeIds(eventTypeIds.map(_.asJava).orNull)
      .status(status.orNull)
      .createdBy(createdBy.orNull)
      .resource(resource.orNull)
      .detailType(detailType.orNull)
      .build()
}
