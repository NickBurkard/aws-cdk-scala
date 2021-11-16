package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LocationCapacityProperty {

  def apply(
    desiredEc2Instances: Number,
    maxSize: Number,
    minSize: Number
  ): software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.Builder)
      .desiredEc2Instances(desiredEc2Instances)
      .maxSize(maxSize)
      .minSize(minSize)
      .build()
}
