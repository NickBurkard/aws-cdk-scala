package io.burkard.cdk.services.codestarnotifications

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationRule {

  def apply(
    internalResourceId: String,
    name: String,
    targets: List[_],
    eventTypeIds: List[String],
    resource: String,
    detailType: String,
    targetAddress: Option[String] = None,
    tags: Option[AnyRef] = None,
    eventTypeId: Option[String] = None,
    status: Option[String] = None,
    createdBy: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule =
    software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .targets(targets.asJava)
      .eventTypeIds(eventTypeIds.asJava)
      .resource(resource)
      .detailType(detailType)
      .targetAddress(targetAddress.orNull)
      .tags(tags.orNull)
      .eventTypeId(eventTypeId.orNull)
      .status(status.orNull)
      .createdBy(createdBy.orNull)
      .build()
}
