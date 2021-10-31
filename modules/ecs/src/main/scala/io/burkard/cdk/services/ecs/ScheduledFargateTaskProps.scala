package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledFargateTaskProps {

  def apply(
    ruleName: Option[String] = None,
    scheduledFargateTaskDefinitionOptions: Option[software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    enabled: Option[Boolean] = None,
    scheduledFargateTaskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    schedule: Option[software.amazon.awscdk.services.applicationautoscaling.Schedule] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    desiredTaskCount: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps.Builder)
      .ruleName(ruleName.orNull)
      .scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions.orNull)
      .platformVersion(platformVersion.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .schedule(schedule.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .desiredTaskCount(desiredTaskCount.orNull)
      .build()
}
