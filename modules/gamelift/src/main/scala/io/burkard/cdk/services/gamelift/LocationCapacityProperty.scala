package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocationCapacityProperty {

  def apply(
    desiredEc2Instances: Option[Number] = None,
    maxSize: Option[Number] = None,
    minSize: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.Builder)
      .desiredEc2Instances(desiredEc2Instances.orNull)
      .maxSize(maxSize.orNull)
      .minSize(minSize.orNull)
      .build()
}
