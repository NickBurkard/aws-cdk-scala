package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetMappingProperty {

  def apply(
    subnetId: Option[String] = None,
    allocationId: Option[String] = None,
    privateIPv4Address: Option[String] = None,
    iPv6Address: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.Builder)
      .subnetId(subnetId.orNull)
      .allocationId(allocationId.orNull)
      .privateIPv4Address(privateIPv4Address.orNull)
      .iPv6Address(iPv6Address.orNull)
      .build()
}
