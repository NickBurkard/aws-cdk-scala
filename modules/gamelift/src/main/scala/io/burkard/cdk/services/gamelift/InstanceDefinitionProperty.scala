package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceDefinitionProperty {

  def apply(
    instanceType: String,
    weightedCapacity: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.Builder)
      .instanceType(instanceType)
      .weightedCapacity(weightedCapacity.orNull)
      .build()
}
