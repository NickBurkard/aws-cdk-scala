package io.burkard.cdk.services.elasticloadbalancing

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenersProperty {

  def apply(
    instancePort: String,
    loadBalancerPort: String,
    protocol: String,
    policyNames: Option[List[String]] = None,
    sslCertificateId: Option[String] = None,
    instanceProtocol: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder)
      .instancePort(instancePort)
      .loadBalancerPort(loadBalancerPort)
      .protocol(protocol)
      .policyNames(policyNames.map(_.asJava).orNull)
      .sslCertificateId(sslCertificateId.orNull)
      .instanceProtocol(instanceProtocol.orNull)
      .build()
}
