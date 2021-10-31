package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomerGatewayAssociation {

  def apply(
    internalResourceId: String,
    linkId: Option[String] = None,
    customerGatewayArn: Option[String] = None,
    deviceId: Option[String] = None,
    globalNetworkId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation =
    software.amazon.awscdk.services.networkmanager.CfnCustomerGatewayAssociation.Builder
      .create(stackCtx, internalResourceId)
      .linkId(linkId.orNull)
      .customerGatewayArn(customerGatewayArn.orNull)
      .deviceId(deviceId.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
