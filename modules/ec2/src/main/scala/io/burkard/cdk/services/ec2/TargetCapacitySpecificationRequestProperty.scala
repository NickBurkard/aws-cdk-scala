package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetCapacitySpecificationRequestProperty {

  def apply(
    totalTargetCapacity: Number,
    onDemandTargetCapacity: Option[Number] = None,
    defaultTargetCapacityType: Option[String] = None,
    spotTargetCapacity: Option[Number] = None,
    targetCapacityUnitType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder)
      .totalTargetCapacity(totalTargetCapacity)
      .onDemandTargetCapacity(onDemandTargetCapacity.orNull)
      .defaultTargetCapacityType(defaultTargetCapacityType.orNull)
      .spotTargetCapacity(spotTargetCapacity.orNull)
      .targetCapacityUnitType(targetCapacityUnitType.orNull)
      .build()
}
