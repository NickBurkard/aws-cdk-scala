package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTriggerProps {

  def apply(
    workflowName: Option[String] = None,
    schedule: Option[String] = None,
    actions: Option[List[_]] = None,
    name: Option[String] = None,
    predicate: Option[software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    startOnCreation: Option[Boolean] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTriggerProps =
    (new software.amazon.awscdk.services.glue.CfnTriggerProps.Builder)
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
