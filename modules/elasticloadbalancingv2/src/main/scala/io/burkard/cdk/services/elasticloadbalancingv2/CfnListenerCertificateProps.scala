package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
