package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGatewayAssociationProps {

  def apply(
    customerGatewayArn: String,
    deviceId: String,
    globalNetworkId: String,
    linkId: Option[String] = None
  ): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.Builder)
      .customerGatewayArn(customerGatewayArn)
      .deviceId(deviceId)
      .globalNetworkId(globalNetworkId)
      .linkId(linkId.orNull)
      .build()
}
