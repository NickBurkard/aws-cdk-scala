package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveProps {

  def apply(
    description: Option[String] = None,
    sourceEventBus: Option[software.amazon.awscdk.services.events.IEventBus] = None,
    retention: Option[software.amazon.awscdk.Duration] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    archiveName: Option[String] = None
  ): software.amazon.awscdk.services.events.ArchiveProps =
    (new software.amazon.awscdk.services.events.ArchiveProps.Builder)
      .description(description.orNull)
      .sourceEventBus(sourceEventBus.orNull)
      .retention(retention.orNull)
      .eventPattern(eventPattern.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
