package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnEventOptions {

  def apply(
    ruleName: Option[String] = None,
    description: Option[String] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    target: Option[software.amazon.awscdk.services.events.IRuleTarget] = None
  ): software.amazon.awscdk.services.events.OnEventOptions =
    (new software.amazon.awscdk.services.events.OnEventOptions.Builder)
      .ruleName(ruleName.orNull)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .target(target.orNull)
      .build()
}
