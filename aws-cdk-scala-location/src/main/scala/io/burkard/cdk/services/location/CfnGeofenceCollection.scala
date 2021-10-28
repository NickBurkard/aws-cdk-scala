package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGeofenceCollection {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    collectionName: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None,
    pricingPlan: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.location.CfnGeofenceCollection =
    software.amazon.awscdk.services.location.CfnGeofenceCollection.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .collectionName(collectionName.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
