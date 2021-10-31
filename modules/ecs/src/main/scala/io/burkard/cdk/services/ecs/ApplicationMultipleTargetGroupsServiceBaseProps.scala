package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationMultipleTargetGroupsServiceBaseProps {

  def apply(
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    loadBalancers: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps]] = None,
    serviceName: Option[String] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps.Builder)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .vpc(vpc.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .serviceName(serviceName.orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
