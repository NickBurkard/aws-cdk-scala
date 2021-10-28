package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceSegmentsProperty {

  def apply(
    version: Option[Number] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.SourceSegmentsProperty.Builder)
      .version(version.orNull)
      .id(id.orNull)
      .build()
}
