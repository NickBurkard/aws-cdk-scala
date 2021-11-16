package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastDomainAssociationProps {

  def apply(
    subnetId: String,
    transitGatewayAttachmentId: String,
    transitGatewayMulticastDomainId: String
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.Builder)
      .subnetId(subnetId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
      .build()
}
