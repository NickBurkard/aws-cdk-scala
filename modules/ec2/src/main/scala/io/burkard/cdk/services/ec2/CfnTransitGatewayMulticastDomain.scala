package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayMulticastDomain {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[AnyRef] = None,
    transitGatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .build()
}
