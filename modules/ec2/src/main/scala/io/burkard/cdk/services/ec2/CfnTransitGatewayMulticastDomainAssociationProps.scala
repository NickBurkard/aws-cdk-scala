package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastDomainAssociationProps {

  def apply(
    subnetId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None,
    transitGatewayMulticastDomainId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.Builder)
      .subnetId(subnetId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId.orNull)
      .build()
}
