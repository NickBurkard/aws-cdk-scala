package io.burkard.cdk.services.elasticloadbalancing

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
