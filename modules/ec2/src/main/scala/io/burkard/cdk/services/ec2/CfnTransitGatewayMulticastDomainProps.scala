package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayMulticastDomainProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[AnyRef] = None,
    transitGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .build()
}
