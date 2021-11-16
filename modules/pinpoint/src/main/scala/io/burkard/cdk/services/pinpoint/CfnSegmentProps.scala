package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSegmentProps {

  def apply(
    name: String,
    applicationId: String,
    tags: Option[AnyRef] = None,
    dimensions: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty] = None,
    segmentGroups: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegmentProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSegmentProps.Builder)
      .name(name)
      .applicationId(applicationId)
      .tags(tags.orNull)
      .dimensions(dimensions.orNull)
      .segmentGroups(segmentGroups.orNull)
      .build()
}
