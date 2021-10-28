package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLinkAssociationProps {

  def apply(
    linkId: Option[String] = None,
    deviceId: Option[String] = None,
    globalNetworkId: Option[String] = None
  ): software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps =
    (new software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps.Builder)
      .linkId(linkId.orNull)
      .deviceId(deviceId.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
