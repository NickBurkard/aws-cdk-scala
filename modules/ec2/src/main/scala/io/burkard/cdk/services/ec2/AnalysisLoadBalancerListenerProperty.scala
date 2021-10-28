package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalysisLoadBalancerListenerProperty {

  def apply(
    instancePort: Option[Number] = None,
    loadBalancerPort: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty.Builder)
      .instancePort(instancePort.orNull)
      .loadBalancerPort(loadBalancerPort.orNull)
      .build()
}
