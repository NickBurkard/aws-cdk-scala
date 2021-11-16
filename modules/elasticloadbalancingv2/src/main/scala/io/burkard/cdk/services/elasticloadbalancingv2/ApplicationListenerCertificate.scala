package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerCertificate {

  def apply(
    internalResourceId: String,
    listener: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None,
    certificateArns: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate.Builder
      .create(stackCtx, internalResourceId)
      .listener(listener)
      .certificates(certificates.map(_.asJava).orNull)
      .certificateArns(certificateArns.map(_.asJava).orNull)
      .build()
}
