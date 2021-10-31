package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledEc2Task {

  def apply(
    internalResourceId: String,
    ruleName: Option[String] = None,
    enabled: Option[Boolean] = None,
    scheduledEc2TaskDefinitionOptions: Option[software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    schedule: Option[software.amazon.awscdk.services.applicationautoscaling.Schedule] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    scheduledEc2TaskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions] = None,
    desiredTaskCount: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task =
    software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task.Builder
      .create(stackCtx, internalResourceId)
      .ruleName(ruleName.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .schedule(schedule.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions.orNull)
      .desiredTaskCount(desiredTaskCount.orNull)
      .build()
}
