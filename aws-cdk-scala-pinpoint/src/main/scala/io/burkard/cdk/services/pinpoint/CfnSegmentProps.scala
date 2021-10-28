package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSegmentProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    applicationId: Option[String] = None,
    dimensions: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty] = None,
    segmentGroups: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegmentProps =
    (new software.amazon.awscdk.services.pinpoint.CfnSegmentProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .applicationId(applicationId.orNull)
      .dimensions(dimensions.orNull)
      .segmentGroups(segmentGroups.orNull)
      .build()
}
