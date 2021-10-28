package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationListenerCertificateProps {

  def apply(
    listener: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps.Builder)
      .listener(listener.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
