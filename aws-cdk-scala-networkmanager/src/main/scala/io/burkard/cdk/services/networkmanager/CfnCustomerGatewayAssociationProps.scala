package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomerGatewayAssociationProps {

  def apply(
    linkId: Option[String] = None,
    customerGatewayArn: Option[String] = None,
    deviceId: Option[String] = None,
    globalNetworkId: Option[String] = None
  ): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociationProps.Builder)
      .linkId(linkId.orNull)
      .customerGatewayArn(customerGatewayArn.orNull)
      .deviceId(deviceId.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
