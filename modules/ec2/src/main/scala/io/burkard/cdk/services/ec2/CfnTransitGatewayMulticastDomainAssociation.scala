package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayMulticastDomainAssociation {

  def apply(
    internalResourceId: String,
    subnetId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None,
    transitGatewayMulticastDomainId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation.Builder
      .create(stackCtx, internalResourceId)
      .subnetId(subnetId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .transitGatewayMulticastDomainId(transitGatewayMulticastDomainId.orNull)
      .build()
}
