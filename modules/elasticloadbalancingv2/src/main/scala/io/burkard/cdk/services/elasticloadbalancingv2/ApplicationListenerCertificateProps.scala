package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerCertificateProps {

  def apply(
    listener: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps.Builder)
      .listener(listener)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
