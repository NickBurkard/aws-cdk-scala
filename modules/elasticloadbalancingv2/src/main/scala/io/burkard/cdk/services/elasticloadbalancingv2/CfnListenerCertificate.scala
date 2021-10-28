package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListenerCertificate {

  def apply(
    internalResourceId: String,
    listenerArn: Option[String] = None,
    certificates: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder
      .create(stackCtx, internalResourceId)
      .listenerArn(listenerArn.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
