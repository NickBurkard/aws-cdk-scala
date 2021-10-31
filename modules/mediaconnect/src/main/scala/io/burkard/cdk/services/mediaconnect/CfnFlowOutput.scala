package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFlowOutput {

  def apply(
    internalResourceId: String,
    streamId: Option[String] = None,
    description: Option[String] = None,
    cidrAllowList: Option[List[String]] = None,
    remoteId: Option[String] = None,
    maxLatency: Option[Number] = None,
    encryption: Option[software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.EncryptionProperty] = None,
    port: Option[Number] = None,
    minLatency: Option[Number] = None,
    flowArn: Option[String] = None,
    protocol: Option[String] = None,
    name: Option[String] = None,
    vpcInterfaceAttachment: Option[software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.VpcInterfaceAttachmentProperty] = None,
    destination: Option[String] = None,
    smoothingLatency: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlowOutput =
    software.amazon.awscdk.services.mediaconnect.CfnFlowOutput.Builder
      .create(stackCtx, internalResourceId)
      .streamId(streamId.orNull)
      .description(description.orNull)
      .cidrAllowList(cidrAllowList.map(_.asJava).orNull)
      .remoteId(remoteId.orNull)
      .maxLatency(maxLatency.orNull)
      .encryption(encryption.orNull)
      .port(port.orNull)
      .minLatency(minLatency.orNull)
      .flowArn(flowArn.orNull)
      .protocol(protocol.orNull)
      .name(name.orNull)
      .vpcInterfaceAttachment(vpcInterfaceAttachment.orNull)
      .destination(destination.orNull)
      .smoothingLatency(smoothingLatency.orNull)
      .build()
}
