package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastDomainAssociation {

  def apply(
    internalResourceId: String,
    subnetId: String,
    transitGatewayAttachmentId: String,
    transitGatewayMulticastDomainId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation.Builder
      .create(stackCtx, internalResourceId)
      .subnetId(subnetId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
      .build()
}
