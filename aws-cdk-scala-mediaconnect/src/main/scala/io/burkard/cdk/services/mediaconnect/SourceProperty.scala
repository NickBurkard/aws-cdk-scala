package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceProperty {

  def apply(
    maxBitrate: Option[Number] = None,
    name: Option[String] = None,
    streamId: Option[String] = None,
    description: Option[String] = None,
    sourceArn: Option[String] = None,
    decryption: Option[software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty] = None,
    maxLatency: Option[Number] = None,
    vpcInterfaceName: Option[String] = None,
    ingestPort: Option[Number] = None,
    minLatency: Option[Number] = None,
    entitlementArn: Option[String] = None,
    whitelistCidr: Option[String] = None,
    sourceIngestPort: Option[String] = None,
    ingestIp: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.Builder)
      .maxBitrate(maxBitrate.orNull)
      .name(name.orNull)
      .streamId(streamId.orNull)
      .description(description.orNull)
      .sourceArn(sourceArn.orNull)
      .decryption(decryption.orNull)
      .maxLatency(maxLatency.orNull)
      .vpcInterfaceName(vpcInterfaceName.orNull)
      .ingestPort(ingestPort.orNull)
      .minLatency(minLatency.orNull)
      .entitlementArn(entitlementArn.orNull)
      .whitelistCidr(whitelistCidr.orNull)
      .sourceIngestPort(sourceIngestPort.orNull)
      .ingestIp(ingestIp.orNull)
      .protocol(protocol.orNull)
      .build()
}
