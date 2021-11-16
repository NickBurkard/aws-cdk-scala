package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceSegmentsProperty {

  def apply(
    id: String,
    version: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.Builder)
      .id(id)
      .version(version.orNull)
      .build()
}
