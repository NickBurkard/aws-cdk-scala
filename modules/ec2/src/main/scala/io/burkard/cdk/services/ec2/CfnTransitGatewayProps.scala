package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayProps {

  def apply(
    autoAcceptSharedAttachments: Option[String] = None,
    defaultRouteTableAssociation: Option[String] = None,
    associationDefaultRouteTableId: Option[String] = None,
    multicastSupport: Option[String] = None,
    vpnEcmpSupport: Option[String] = None,
    defaultRouteTablePropagation: Option[String] = None,
    amazonSideAsn: Option[Number] = None,
    transitGatewayCidrBlocks: Option[List[String]] = None,
    dnsSupport: Option[String] = None,
    propagationDefaultRouteTableId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayProps.Builder)
      .autoAcceptSharedAttachments(autoAcceptSharedAttachments.orNull)
      .defaultRouteTableAssociation(defaultRouteTableAssociation.orNull)
      .associationDefaultRouteTableId(associationDefaultRouteTableId.orNull)
      .multicastSupport(multicastSupport.orNull)
      .vpnEcmpSupport(vpnEcmpSupport.orNull)
      .defaultRouteTablePropagation(defaultRouteTablePropagation.orNull)
      .amazonSideAsn(amazonSideAsn.orNull)
      .transitGatewayCidrBlocks(transitGatewayCidrBlocks.map(_.asJava).orNull)
      .dnsSupport(dnsSupport.orNull)
      .propagationDefaultRouteTableId(propagationDefaultRouteTableId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
