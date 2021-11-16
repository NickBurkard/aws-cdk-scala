package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGeofenceCollectionProps {

  def apply(
    collectionName: String,
    pricingPlan: String,
    description: Option[String] = None,
    pricingPlanDataSource: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnGeofenceCollectionProps =
    (new software.amazon.awscdk.services.location.CfnGeofenceCollectionProps.Builder)
      .collectionName(collectionName)
      .pricingPlan(pricingPlan)
      .description(description.orNull)
      .pricingPlanDataSource(pricingPlanDataSource.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
