package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGeofenceCollection {

  def apply(
    internalResourceId: String,
    collectionName: String,
    pricingPlan: String,
    description: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnGeofenceCollection =
    software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder
      .create(stackCtx, internalResourceId)
      .collectionName(collectionName)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
