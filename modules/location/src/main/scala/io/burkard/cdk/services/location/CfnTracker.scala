package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTracker {

  def apply(
    internalResourceId: String,
    trackerName: String,
    pricingPlan: String,
    description: Option[String] = None,
    positionFiltering: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnTracker =
    software.amazon.awscdk.services.location.CfnTracker.Builder
      .create(stackCtx, internalResourceId)
      .trackerName(trackerName)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .positionFiltering(positionFiltering.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
