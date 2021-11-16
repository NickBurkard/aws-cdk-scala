package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledTaskBaseProps {

  def apply(
    schedule: software.amazon.awscdk.services.applicationautoscaling.Schedule,
    ruleName: Option[String] = None,
    enabled: Option[Boolean] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    desiredTaskCount: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledTaskBaseProps.Builder)
      .schedule(schedule)
      .ruleName(ruleName.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .desiredTaskCount(desiredTaskCount.orNull)
      .build()
}
