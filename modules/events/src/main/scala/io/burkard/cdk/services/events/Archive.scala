package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Archive {

  def apply(
    internalResourceId: String,
    sourceEventBus: software.amazon.awscdk.services.events.IEventBus,
    description: Option[String] = None,
    retention: Option[software.amazon.awscdk.Duration] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    archiveName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.Archive =
    software.amazon.awscdk.services.events.Archive.Builder
      .create(stackCtx, internalResourceId)
      .sourceEventBus(sourceEventBus)
      .description(description.orNull)
      .retention(retention.orNull)
      .eventPattern(eventPattern.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
