package io.burkard.cdk.services.elasticloadbalancing

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLoadBalancer {

  def apply(
    internalResourceId: String,
    connectionDrainingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty] = None,
    crossZone: Option[Boolean] = None,
    listeners: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    instances: Option[List[String]] = None,
    lbCookieStickinessPolicy: Option[List[_]] = None,
    scheme: Option[String] = None,
    loadBalancerName: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    connectionSettings: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty] = None,
    availabilityZones: Option[List[String]] = None,
    appCookieStickinessPolicy: Option[List[_]] = None,
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty] = None,
    subnets: Option[List[String]] = None,
    accessLoggingPolicy: Option[software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty] = None,
    policies: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer =
    software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.Builder
      .create(stackCtx, internalResourceId)
      .connectionDrainingPolicy(connectionDrainingPolicy.orNull)
      .crossZone(crossZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .listeners(listeners.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .instances(instances.map(_.asJava).orNull)
      .lbCookieStickinessPolicy(lbCookieStickinessPolicy.map(_.asJava).orNull)
      .scheme(scheme.orNull)
      .loadBalancerName(loadBalancerName.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .connectionSettings(connectionSettings.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .appCookieStickinessPolicy(appCookieStickinessPolicy.map(_.asJava).orNull)
      .healthCheck(healthCheck.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .accessLoggingPolicy(accessLoggingPolicy.orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}
