package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseArchiveProps {

  def apply(
    eventPattern: software.amazon.awscdk.services.events.EventPattern,
    description: Option[String] = None,
    retention: Option[software.amazon.awscdk.Duration] = None,
    archiveName: Option[String] = None
  ): software.amazon.awscdk.services.events.BaseArchiveProps =
    (new software.amazon.awscdk.services.events.BaseArchiveProps.Builder)
      .eventPattern(eventPattern)
      .description(description.orNull)
      .retention(retention.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
