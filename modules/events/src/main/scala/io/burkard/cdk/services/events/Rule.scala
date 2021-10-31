package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Rule {

  def apply(
    internalResourceId: String,
    ruleName: Option[String] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.events.IRuleTarget]] = None,
    description: Option[String] = None,
    enabled: Option[Boolean] = None,
    eventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    schedule: Option[software.amazon.awscdk.services.events.Schedule] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.Rule =
    software.amazon.awscdk.services.events.Rule.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName.orNull)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventBus(eventBus.orNull)
      .eventPattern(eventPattern.orNull)
      .schedule(schedule.orNull)
      .build()
}
