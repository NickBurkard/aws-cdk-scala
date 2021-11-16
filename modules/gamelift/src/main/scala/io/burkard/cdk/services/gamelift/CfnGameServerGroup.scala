package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGameServerGroup {

  def apply(
    internalResourceId: String,
    gameServerGroupName: String,
    instanceDefinitions: List[_],
    launchTemplate: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty,
    roleArn: String,
    balancingStrategy: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcSubnets: Option[List[String]] = None,
    maxSize: Option[Number] = None,
    minSize: Option[Number] = None,
    gameServerProtectionPolicy: Option[String] = None,
    deleteOption: Option[String] = None,
    autoScalingPolicy: Option[software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnGameServerGroup =
    software.amazon.awscdk.services.gamelift.CfnGameServerGroup.Builder
      .create(stackCtx, internalResourceId)
      .gameServerGroupName(gameServerGroupName)
      .instanceDefinitions(instanceDefinitions.asJava)
      .launchTemplate(launchTemplate)
      .roleArn(roleArn)
      .balancingStrategy(balancingStrategy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .maxSize(maxSize.orNull)
      .minSize(minSize.orNull)
      .gameServerProtectionPolicy(gameServerProtectionPolicy.orNull)
      .deleteOption(deleteOption.orNull)
      .autoScalingPolicy(autoScalingPolicy.orNull)
      .build()
}
