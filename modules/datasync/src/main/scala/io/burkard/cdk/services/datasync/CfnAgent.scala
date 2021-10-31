package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAgent {

  def apply(
    internalResourceId: String,
    subnetArns: Option[List[String]] = None,
    agentName: Option[String] = None,
    activationKey: Option[String] = None,
    vpcEndpointId: Option[String] = None,
    securityGroupArns: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnAgent =
    software.amazon.awscdk.services.datasync.CfnAgent.Builder
      .create(stackCtx, internalResourceId)
      .subnetArns(subnetArns.map(_.asJava).orNull)
      .agentName(agentName.orNull)
      .activationKey(activationKey.orNull)
      .vpcEndpointId(vpcEndpointId.orNull)
      .securityGroupArns(securityGroupArns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
