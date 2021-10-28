package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MatchAttributesProperty {

  def apply(
    protocols: Option[List[_ <: Number]] = None,
    sourcePorts: Option[List[_]] = None,
    tcpFlags: Option[List[_]] = None,
    destinationPorts: Option[List[_]] = None,
    sources: Option[List[_]] = None,
    destinations: Option[List[_]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.MatchAttributesProperty.Builder)
      .protocols(protocols.map(_.asJava).orNull)
      .sourcePorts(sourcePorts.map(_.asJava).orNull)
      .tcpFlags(tcpFlags.map(_.asJava).orNull)
      .destinationPorts(destinationPorts.map(_.asJava).orNull)
      .sources(sources.map(_.asJava).orNull)
      .destinations(destinations.map(_.asJava).orNull)
      .build()
}