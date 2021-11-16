package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetMappingProperty {

  def apply(
    subnetId: String,
    allocationId: Option[String] = None,
    privateIPv4Address: Option[String] = None,
    iPv6Address: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.Builder)
      .subnetId(subnetId)
      .allocationId(allocationId.orNull)
      .privateIPv4Address(privateIPv4Address.orNull)
      .iPv6Address(iPv6Address.orNull)
      .build()
}
