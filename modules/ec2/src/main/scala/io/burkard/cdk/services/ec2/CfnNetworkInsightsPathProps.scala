package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkInsightsPathProps {

  def apply(
    source: String,
    protocol: String,
    destination: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    destinationPort: Option[Number] = None,
    destinationIp: Option[String] = None,
    sourceIp: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInsightsPathProps.Builder)
      .source(source)
      .protocol(protocol)
      .destination(destination)
      .tags(tags.map(_.asJava).orNull)
      .destinationPort(destinationPort.orNull)
      .destinationIp(destinationIp.orNull)
      .sourceIp(sourceIp.orNull)
      .build()
}
