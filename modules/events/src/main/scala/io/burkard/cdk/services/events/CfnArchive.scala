package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnArchive {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    sourceArn: Option[String] = None,
    eventPattern: Option[AnyRef] = None,
    retentionDays: Option[Number] = None,
    archiveName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnArchive =
    software.amazon.awscdk.services.events.CfnArchive.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .sourceArn(sourceArn.orNull)
      .eventPattern(eventPattern.orNull)
      .retentionDays(retentionDays.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
