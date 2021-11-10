package io.burkard.cdk.services.elasticloadbalancingv2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerAttributes {

  def apply(
    securityGroupId: Option[String] = None,
    securityGroupAllowsAllOutbound: Option[Boolean] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    listenerArn: Option[String] = None,
    defaultPort: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.Builder)
      .securityGroupId(securityGroupId.orNull)
      .securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroup(securityGroup.orNull)
      .listenerArn(listenerArn.orNull)
      .defaultPort(defaultPort.orNull)
      .build()
}
