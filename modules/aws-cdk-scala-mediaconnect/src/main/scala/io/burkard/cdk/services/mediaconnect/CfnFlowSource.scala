package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFlowSource {

  def apply(
    internalResourceId: String,
    maxBitrate: Option[Number] = None,
    name: Option[String] = None,
    streamId: Option[String] = None,
    description: Option[String] = None,
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
      .maxBitrate(maxBitrate.orNull)
      .name(name.orNull)
      .streamId(streamId.orNull)
      .description(description.orNull)
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
