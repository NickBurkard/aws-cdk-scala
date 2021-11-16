package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLinkAssociation {

  def apply(
    internalResourceId: String,
    linkId: String,
    deviceId: String,
    globalNetworkId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnLinkAssociation =
    software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder
      .create(stackCtx, internalResourceId)
      .linkId(linkId)
      .deviceId(deviceId)
      .globalNetworkId(globalNetworkId)
      .build()
}
