package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleProps {

  def apply(
    ruleName: Option[String] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.events.IRuleTarget]] = None,
    description: Option[String] = None,
    enabled: Option[Boolean] = None,
    eventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    schedule: Option[software.amazon.awscdk.services.events.Schedule] = None
  ): software.amazon.awscdk.services.events.RuleProps =
    (new software.amazon.awscdk.services.events.RuleProps.Builder)
      .ruleName(ruleName.orNull)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventBus(eventBus.orNull)
      .eventPattern(eventPattern.orNull)
      .schedule(schedule.orNull)
      .build()
}