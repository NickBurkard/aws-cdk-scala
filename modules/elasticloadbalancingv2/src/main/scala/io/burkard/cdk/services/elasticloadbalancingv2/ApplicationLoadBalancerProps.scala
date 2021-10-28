package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancerProps {

  def apply(
    internetFacing: Option[Boolean] = None,
    idleTimeout: Option[software.amazon.awscdk.Duration] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deletionProtection: Option[Boolean] = None,
    loadBalancerName: Option[String] = None,
    ipAddressType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    http2Enabled: Option[Boolean] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.Builder)
      .internetFacing(internetFacing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .idleTimeout(idleTimeout.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loadBalancerName(loadBalancerName.orNull)
      .ipAddressType(ipAddressType.orNull)
      .vpc(vpc.orNull)
      .http2Enabled(http2Enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroup(securityGroup.orNull)
      .build()
}
