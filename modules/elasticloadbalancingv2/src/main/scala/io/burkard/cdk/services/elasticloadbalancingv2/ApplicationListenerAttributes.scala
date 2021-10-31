package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerAttributes {

  def apply(
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    listenerArn: Option[String] = None,
    defaultPort: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.Builder)
      .securityGroup(securityGroup.orNull)
      .listenerArn(listenerArn.orNull)
      .defaultPort(defaultPort.orNull)
      .build()
}
