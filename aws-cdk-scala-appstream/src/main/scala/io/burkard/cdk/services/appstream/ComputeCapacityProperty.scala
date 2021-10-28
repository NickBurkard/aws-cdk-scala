package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComputeCapacityProperty {

  def apply(
    desiredInstances: Option[Number] = None
  ): software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty =
    (new software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty.Builder)
      .desiredInstances(desiredInstances.orNull)
      .build()
}
