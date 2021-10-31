package io.burkard.cdk.services.elasticloadbalancing

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBalancerProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancing.HealthCheck] = None,
    crossZone: Option[Boolean] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget]] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener]] = None,
    internetFacing: Option[Boolean] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    accessLoggingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder)
      .healthCheck(healthCheck.orNull)
      .crossZone(crossZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targets(targets.map(_.asJava).orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .subnetSelection(subnetSelection.orNull)
      .vpc(vpc.orNull)
      .accessLoggingPolicy(accessLoggingPolicy.orNull)
      .build()
}
