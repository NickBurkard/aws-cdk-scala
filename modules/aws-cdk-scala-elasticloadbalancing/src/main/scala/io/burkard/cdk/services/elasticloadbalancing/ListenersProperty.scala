package io.burkard.cdk.services.elasticloadbalancing

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenersProperty {

  def apply(
    instancePort: Option[String] = None,
    policyNames: Option[List[String]] = None,
    loadBalancerPort: Option[String] = None,
    sslCertificateId: Option[String] = None,
    instanceProtocol: Option[String] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder)
      .instancePort(instancePort.orNull)
      .policyNames(policyNames.map(_.asJava).orNull)
      .loadBalancerPort(loadBalancerPort.orNull)
      .sslCertificateId(sslCertificateId.orNull)
      .instanceProtocol(instanceProtocol.orNull)
      .protocol(protocol.orNull)
      .build()
}
