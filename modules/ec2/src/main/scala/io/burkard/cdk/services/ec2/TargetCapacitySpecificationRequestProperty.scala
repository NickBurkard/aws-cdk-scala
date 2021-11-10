package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetCapacitySpecificationRequestProperty {

  def apply(
    onDemandTargetCapacity: Option[Number] = None,
    defaultTargetCapacityType: Option[String] = None,
    totalTargetCapacity: Option[Number] = None,
    spotTargetCapacity: Option[Number] = None,
    targetCapacityUnitType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder)
      .onDemandTargetCapacity(onDemandTargetCapacity.orNull)
      .defaultTargetCapacityType(defaultTargetCapacityType.orNull)
      .totalTargetCapacity(totalTargetCapacity.orNull)
      .spotTargetCapacity(spotTargetCapacity.orNull)
      .targetCapacityUnitType(targetCapacityUnitType.orNull)
      .build()
}
