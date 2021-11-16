package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSegment {

  def apply(
    internalResourceId: String,
    name: String,
    applicationId: String,
    tags: Option[AnyRef] = None,
    dimensions: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty] = None,
    segmentGroups: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentGroupsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnSegment =
    software.amazon.awscdk.services.pinpoint.CfnSegment.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .applicationId(applicationId)
      .tags(tags.orNull)
      .dimensions(dimensions.orNull)
      .segmentGroups(segmentGroups.orNull)
      .build()
}
