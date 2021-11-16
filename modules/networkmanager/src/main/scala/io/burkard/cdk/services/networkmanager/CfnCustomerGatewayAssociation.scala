package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGatewayAssociation {

  def apply(
    internalResourceId: String,
    customerGatewayArn: String,
    deviceId: String,
    globalNetworkId: String,
    linkId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation =
    software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder
      .create(stackCtx, internalResourceId)
      .customerGatewayArn(customerGatewayArn)
      .deviceId(deviceId)
      .globalNetworkId(globalNetworkId)
      .linkId(linkId.orNull)
      .build()
}
