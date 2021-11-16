package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnArchiveProps {

  def apply(
    sourceArn: String,
    description: Option[String] = None,
    eventPattern: Option[AnyRef] = None,
    retentionDays: Option[Number] = None,
    archiveName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnArchiveProps =
    (new software.amazon.awscdk.services.events.CfnArchiveProps.Builder)
      .sourceArn(sourceArn)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .retentionDays(retentionDays.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
