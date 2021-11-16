package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowSource {

  def apply(
    internalResourceId: String,
    name: String,
    description: String,
    maxBitrate: Option[Number] = None,
    streamId: Option[String] = None,
    decryption: Option[software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty] = None,
    maxLatency: Option[Number] = None,
    vpcInterfaceName: Option[String] = None,
    ingestPort: Option[Number] = None,
    entitlementArn: Option[String] = None,
    whitelistCidr: Option[String] = None,
    flowArn: Option[String] = None,
    protocol: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlowSource =
    software.amazon.awscdk.services.mediaconnect.CfnFlowSource.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .description(description)
      .maxBitrate(maxBitrate.orNull)
      .streamId(streamId.orNull)
      .decryption(decryption.orNull)
      .maxLatency(maxLatency.orNull)
      .vpcInterfaceName(vpcInterfaceName.orNull)
      .ingestPort(ingestPort.orNull)
      .entitlementArn(entitlementArn.orNull)
      .whitelistCidr(whitelistCidr.orNull)
      .flowArn(flowArn.orNull)
      .protocol(protocol.orNull)
      .build()
}
