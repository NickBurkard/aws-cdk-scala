package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClientVpnEndpoint {

  def apply(
    internalResourceId: String,
    connectionLogOptions: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty] = None,
    tagSpecifications: Option[List[_]] = None,
    clientConnectOptions: Option[software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty] = None,
    vpcId: Option[String] = None,
    vpnPort: Option[Number] = None,
    securityGroupIds: Option[List[String]] = None,
    clientCidrBlock: Option[String] = None,
    serverCertificateArn: Option[String] = None,
    selfServicePortal: Option[String] = None,
    authenticationOptions: Option[List[_]] = None,
    splitTunnel: Option[Boolean] = None,
    dnsServers: Option[List[String]] = None,
    description: Option[String] = None,
    transportProtocol: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint =
    software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .connectionLogOptions(connectionLogOptions.orNull)
      .tagSpecifications(tagSpecifications.map(_.asJava).orNull)
      .clientConnectOptions(clientConnectOptions.orNull)
      .vpcId(vpcId.orNull)
      .vpnPort(vpnPort.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .clientCidrBlock(clientCidrBlock.orNull)
      .serverCertificateArn(serverCertificateArn.orNull)
      .selfServicePortal(selfServicePortal.orNull)
      .authenticationOptions(authenticationOptions.map(_.asJava).orNull)
      .splitTunnel(splitTunnel.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dnsServers(dnsServers.map(_.asJava).orNull)
      .description(description.orNull)
      .transportProtocol(transportProtocol.orNull)
      .build()
}
