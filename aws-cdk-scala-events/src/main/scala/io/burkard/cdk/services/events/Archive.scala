package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Archive {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    sourceEventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None,
    retention: Option[software.amazon.awscdk.Duration] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    archiveName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.Archive =
    software.amazon.awscdk.services.events.Archive.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .sourceEventBus(sourceEventBus.orNull)
      .retention(retention.orNull)
      .eventPattern(eventPattern.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
