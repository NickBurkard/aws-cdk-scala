package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SegmentDimensionsProperty {

  def apply(
    location: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.LocationProperty] = None,
    attributes: Option[AnyRef] = None,
    demographic: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.DemographicProperty] = None,
    userAttributes: Option[AnyRef] = None,
    metrics: Option[AnyRef] = None,
    behavior: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.SegmentDimensionsProperty.Builder)
      .location(location.orNull)
      .attributes(attributes.orNull)
      .demographic(demographic.orNull)
      .userAttributes(userAttributes.orNull)
      .metrics(metrics.orNull)
      .behavior(behavior.orNull)
      .build()
}
