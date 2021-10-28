package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledTaskBaseProps {

  def apply(
    ruleName: Option[String] = None,
    enabled: Option[Boolean] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    schedule: Option[software.amazon.awscdk.services.applicationautoscaling.Schedule] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    desiredTaskCount: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.Builder)
      .ruleName(ruleName.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .schedule(schedule.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .desiredTaskCount(desiredTaskCount.orNull)
      .build()
}
