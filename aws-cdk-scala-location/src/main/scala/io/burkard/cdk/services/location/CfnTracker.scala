package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTracker {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    trackerName: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None,
    pricingPlan: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnTracker =
    software.amazon.awscdk.services.location.CfnTracker.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .trackerName(trackerName.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
