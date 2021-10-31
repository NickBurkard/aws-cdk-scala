package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTrafficMirrorSession {

  def apply(
    internalResourceId: String,
    trafficMirrorFilterId: Option[String] = None,
    virtualNetworkId: Option[Number] = None,
    trafficMirrorTargetId: Option[String] = None,
    sessionNumber: Option[Number] = None,
    networkInterfaceId: Option[String] = None,
    description: Option[String] = None,
    packetLength: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession =
    software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession.Builder
      .create(stackCtx, internalResourceId)
      .trafficMirrorFilterId(trafficMirrorFilterId.orNull)
      .virtualNetworkId(virtualNetworkId.orNull)
      .trafficMirrorTargetId(trafficMirrorTargetId.orNull)
      .sessionNumber(sessionNumber.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .description(description.orNull)
      .packetLength(packetLength.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
