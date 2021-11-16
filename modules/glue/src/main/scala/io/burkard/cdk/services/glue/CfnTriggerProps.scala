package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTriggerProps {

  def apply(
    actions: List[_],
    `type`: String,
    workflowName: Option[String] = None,
    schedule: Option[String] = None,
    name: Option[String] = None,
    predicate: Option[software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    startOnCreation: Option[Boolean] = None
  ): software.amazon.awscdk.services.glue.CfnTriggerProps =
    (new software.amazon.awscdk.services.glue.CfnTriggerProps.Builder)
      .actions(actions.asJava)
      .`type`(`type`)
      .workflowName(workflowName.orNull)
      .schedule(schedule.orNull)
      .name(name.orNull)
      .predicate(predicate.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .startOnCreation(startOnCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
