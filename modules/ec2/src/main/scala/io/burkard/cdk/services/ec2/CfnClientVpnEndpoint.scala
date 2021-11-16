package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnEndpoint {

  def apply(
    internalResourceId: String,
    connectionLogOptions: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty,
    clientCidrBlock: String,
    serverCertificateArn: String,
    authenticationOptions: List[_],
    tagSpecifications: Option[List[_]] = None,
    clientConnectOptions: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty] = None,
    vpcId: Option[String] = None,
    vpnPort: Option[Number] = None,
    securityGroupIds: Option[List[String]] = None,
    selfServicePortal: Option[String] = None,
    splitTunnel: Option[Boolean] = None,
    dnsServers: Option[List[String]] = None,
    description: Option[String] = None,
    transportProtocol: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint =
    software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .connectionLogOptions(connectionLogOptions)
      .clientCidrBlock(clientCidrBlock)
      .serverCertificateArn(serverCertificateArn)
      .authenticationOptions(authenticationOptions.asJava)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .clientConnectOptions(clientConnectOptions.orNull)
      .vpcId(vpcId.orNull)
      .vpnPort(vpnPort.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .selfServicePortal(selfServicePortal.orNull)
      .splitTunnel(splitTunnel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .description(description.orNull)
      .transportProtocol(transportProtocol.orNull)
      .build()
}
