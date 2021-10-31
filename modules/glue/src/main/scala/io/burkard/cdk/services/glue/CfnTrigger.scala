package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrigger {

  def apply(
    internalResourceId: String,
    workflowName: Option[String] = None,
    schedule: Option[String] = None,
    actions: Option[List[_]] = None,
    name: Option[String] = None,
    predicate: Option[software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    startOnCreation: Option[Boolean] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnTrigger =
    software.amazon.awscdk.services.glue.CfnTrigger.Builder
      .create(stackCtx, internalResourceId)
      .workflowName(workflowName.orNull)
      .schedule(schedule.orNull)
      .actions(actions.map(_.asJava).orNull)
      .name(name.orNull)
      .predicate(predicate.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .startOnCreation(startOnCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .build()
}
