package io.burkard.cdk.services.mediaconvert

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueue {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    status: Option[String] = None,
    pricingPlan: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconvert.CfnQueue =
    software.amazon.awscdk.services.mediaconvert.CfnQueue.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .status(status.orNull)
      .pricingPlan(pricingPlan.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
