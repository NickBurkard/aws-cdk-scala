package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnQueueProps {

  def apply(
    name: Option[String] = None,
    status: Option[String] = None,
    pricingPlan: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.mediaconvert.CfnQueueProps =
    (new software.amazon.awscdk.services.mediaconvert.CfnQueueProps.Builder)
      .name(name.orNull)
      .status(status.orNull)
      .pricingPlan(pricingPlan.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
