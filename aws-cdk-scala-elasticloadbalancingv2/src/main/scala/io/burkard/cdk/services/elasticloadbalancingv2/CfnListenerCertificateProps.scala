package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListenerCertificateProps {

  def apply(
    listenerArn: Option[String] = None,
    certificates: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps.Builder)
      .listenerArn(listenerArn.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
