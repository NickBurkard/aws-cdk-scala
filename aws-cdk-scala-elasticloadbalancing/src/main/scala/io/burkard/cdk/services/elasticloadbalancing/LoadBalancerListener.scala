package io.burkard.cdk.services.elasticloadbalancing

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoadBalancerListener {

  def apply(
    sslCertificateArn: Option[String] = None,
    internalProtocol: Option[software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol] = None,
    policyNames: Option[List[String]] = None,
    allowConnectionsFrom: Option[List[_ <: software.amazon.awscdk.services.ec2.IConnectable]] = None,
    internalPort: Option[Number] = None,
    externalProtocol: Option[software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol] = None,
    externalPort: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener =
    (new software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder)
      .sslCertificateArn(sslCertificateArn.orNull)
      .internalProtocol(internalProtocol.orNull)
      .policyNames(policyNames.map(_.asJava).orNull)
      .allowConnectionsFrom(allowConnectionsFrom.map(_.asJava).orNull)
      .internalPort(internalPort.orNull)
      .externalProtocol(externalProtocol.orNull)
      .externalPort(externalPort.orNull)
      .build()
}
