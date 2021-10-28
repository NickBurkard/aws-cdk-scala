package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnArchiveProps {

  def apply(
    description: Option[String] = None,
    sourceArn: Option[String] = None,
    eventPattern: Option[AnyRef] = None,
    retentionDays: Option[Number] = None,
    archiveName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnArchiveProps =
    (new software.amazon.awscdk.services.events.CfnArchiveProps.Builder)
      .description(description.orNull)
      .sourceArn(sourceArn.orNull)
      .eventPattern(eventPattern.orNull)
      .retentionDays(retentionDays.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
