package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceDefinitionProperty {

  def apply(
    instanceType: Option[String] = None,
    weightedCapacity: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.Builder)
      .instanceType(instanceType.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .build()
}
