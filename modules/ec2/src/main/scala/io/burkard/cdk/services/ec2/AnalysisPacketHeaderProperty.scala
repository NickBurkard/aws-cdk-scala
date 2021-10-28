package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnalysisPacketHeaderProperty {

  def apply(
    sourceAddresses: Option[List[String]] = None,
    sourcePortRanges: Option[List[_]] = None,
    protocol: Option[String] = None,
    destinationAddresses: Option[List[String]] = None,
    destinationPortRanges: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder)
      .sourceAddresses(sourceAddresses.map(_.asJava).orNull)
      .sourcePortRanges(sourcePortRanges.map(_.asJava).orNull)
      .protocol(protocol.orNull)
      .destinationAddresses(destinationAddresses.map(_.asJava).orNull)
      .destinationPortRanges(destinationPortRanges.map(_.asJava).orNull)
      .build()
}
