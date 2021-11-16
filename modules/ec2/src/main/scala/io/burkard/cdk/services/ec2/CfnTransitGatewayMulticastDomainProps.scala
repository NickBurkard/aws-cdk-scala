package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastDomainProps {

  def apply(
    transitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[AnyRef] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainProps.Builder)
      .transitGatewayId(transitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
