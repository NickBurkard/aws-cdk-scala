package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGameServerGroupProps {

  def apply(
    balancingStrategy: Option[String] = None,
    gameServerGroupName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    instanceDefinitions: Option[List[_]] = None,
    launchTemplate: Option[software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty] = None,
    vpcSubnets: Option[List[String]] = None,
    maxSize: Option[Number] = None,
    minSize: Option[Number] = None,
    roleArn: Option[String] = None,
    gameServerProtectionPolicy: Option[String] = None,
    deleteOption: Option[String] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps =
    (new software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps.Builder)
      .balancingStrategy(balancingStrategy.orNull)
      .gameServerGroupName(gameServerGroupName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .instanceDefinitions(instanceDefinitions.map(_.asJava).orNull)
      .launchTemplate(launchTemplate.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .maxSize(maxSize.orNull)
      .minSize(minSize.orNull)
      .roleArn(roleArn.orNull)
      .gameServerProtectionPolicy(gameServerProtectionPolicy.orNull)
      .deleteOption(deleteOption.orNull)
      .autoScalingPolicy(autoScalingPolicy.orNull)
      .build()
}
