package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrackerProps {

  def apply(
    description: Option[String] = None,
    trackerName: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None,
    pricingPlan: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnTrackerProps =
    (new software.amazon.awscdk.services.location.CfnTrackerProps.Builder)
      .description(description.orNull)
      .trackerName(trackerName.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
