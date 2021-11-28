package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerAttributes {

  def apply(
    listenerArn: String,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    defaultPort: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes.Builder)
      .listenerArn(listenerArn)
      .securityGroup(securityGroup.orNull)
      .defaultPort(defaultPort.orNull)
      .build()
}
