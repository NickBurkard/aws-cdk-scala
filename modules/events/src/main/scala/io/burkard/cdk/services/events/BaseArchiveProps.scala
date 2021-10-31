package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseArchiveProps {

  def apply(
    description: Option[String] = None,
    retention: Option[software.amazon.awscdk.Duration] = None,
    eventPattern: Option[software.amazon.awscdk.services.events.EventPattern] = None,
    archiveName: Option[String] = None
  ): software.amazon.awscdk.services.events.BaseArchiveProps =
    (new software.amazon.awscdk.services.events.BaseArchiveProps.Builder)
      .description(description.orNull)
      .retention(retention.orNull)
      .eventPattern(eventPattern.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
