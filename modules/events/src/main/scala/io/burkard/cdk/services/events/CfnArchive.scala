package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnArchive {

  def apply(
    internalResourceId: String,
    sourceArn: String,
    description: Option[String] = None,
    eventPattern: Option[AnyRef] = None,
    retentionDays: Option[Number] = None,
    archiveName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnArchive =
    software.amazon.awscdk.services.events.CfnArchive.Builder
      .create(stackCtx, internalResourceId)
      .sourceArn(sourceArn)
      .description(description.orNull)
      .eventPattern(eventPattern.orNull)
      .retentionDays(retentionDays.orNull)
      .archiveName(archiveName.orNull)
      .build()
}
