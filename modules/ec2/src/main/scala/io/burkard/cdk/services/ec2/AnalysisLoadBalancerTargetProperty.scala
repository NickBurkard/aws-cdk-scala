package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalysisLoadBalancerTargetProperty {

  def apply(
    availabilityZone: Option[String] = None,
    instance: Option[software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisComponentProperty] = None,
    port: Option[Number] = None,
    address: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .instance(instance.orNull)
      .port(port.orNull)
      .address(address.orNull)
      .build()
}
