package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortRangeProperty {

  def apply(
    to: Option[Number] = None,
    from: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.PortRangeProperty.Builder)
      .to(to.orNull)
      .from(from.orNull)
      .build()
}
