package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGeofenceCollectionProps {

  def apply(
    description: Option[String] = None,
    collectionName: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None,
    pricingPlan: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnGeofenceCollectionProps =
    (new software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.Builder)
      .description(description.orNull)
      .collectionName(collectionName.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .pricingPlan(pricingPlan.orNull)
      .build()
}
