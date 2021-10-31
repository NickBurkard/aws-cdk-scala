package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFleetProps {

  def apply(
    locations: Option[List[_]] = None,
    name: Option[String] = None,
    instanceRoleArn: Option[String] = None,
    desiredEc2Instances: Option[Number] = None,
    description: Option[String] = None,
    peerVpcAwsAccountId: Option[String] = None,
    metricGroups: Option[List[String]] = None,
    fleetType: Option[String] = None,
    certificateConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty] = None,
    minSize: Option[Number] = None,
    buildId: Option[String] = None,
    ec2InboundPermissions: Option[List[_]] = None,
    ec2InstanceType: Option[String] = None,
    scriptId: Option[String] = None,
    peerVpcId: Option[String] = None,
    resourceCreationLimitPolicy: Option[software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty] = None,
    runtimeConfiguration: Option[software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty] = None,
    newGameSessionProtectionPolicy: Option[String] = None,
    maxSize: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleetProps =
    (new software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder)
      .locations(locations.map(_.asJava).orNull)
      .name(name.orNull)
      .instanceRoleArn(instanceRoleArn.orNull)
      .desiredEc2Instances(desiredEc2Instances.orNull)
      .description(description.orNull)
      .peerVpcAwsAccountId(peerVpcAwsAccountId.orNull)
      .metricGroups(metricGroups.map(_.asJava).orNull)
      .fleetType(fleetType.orNull)
      .certificateConfiguration(certificateConfiguration.orNull)
      .minSize(minSize.orNull)
      .buildId(buildId.orNull)
      .ec2InboundPermissions(ec2InboundPermissions.map(_.asJava).orNull)
      .ec2InstanceType(ec2InstanceType.orNull)
      .scriptId(scriptId.orNull)
      .peerVpcId(peerVpcId.orNull)
      .resourceCreationLimitPolicy(resourceCreationLimitPolicy.orNull)
      .runtimeConfiguration(runtimeConfiguration.orNull)
      .newGameSessionProtectionPolicy(newGameSessionProtectionPolicy.orNull)
      .maxSize(maxSize.orNull)
      .build()
}
