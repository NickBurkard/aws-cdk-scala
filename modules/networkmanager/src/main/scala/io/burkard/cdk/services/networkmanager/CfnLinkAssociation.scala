package io.burkard.cdk.services.networkmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLinkAssociation {

  def apply(
    internalResourceId: String,
    linkId: Option[String] = None,
    deviceId: Option[String] = None,
    globalNetworkId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkmanager.CfnLinkAssociation =
    software.amazon.awscdk.services.networkmanager.CfnLinkAssociation.Builder
      .create(stackCtx, internalResourceId)
      .linkId(linkId.orNull)
      .deviceId(deviceId.orNull)
      .globalNetworkId(globalNetworkId.orNull)
      .build()
}
