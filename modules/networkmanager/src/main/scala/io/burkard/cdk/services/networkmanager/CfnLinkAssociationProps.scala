package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLinkAssociationProps {

  def apply(
    linkId: String,
    deviceId: String,
    globalNetworkId: String
  ): software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.Builder)
      .linkId(linkId)
      .deviceId(deviceId)
      .globalNetworkId(globalNetworkId)
      .build()
}
