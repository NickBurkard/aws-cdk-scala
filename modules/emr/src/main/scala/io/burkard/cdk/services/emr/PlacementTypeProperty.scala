package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PlacementTypeProperty {

  def apply(
    availabilityZone: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.PlacementTypeProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .build()
}
