package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerCertificate {

  def apply(
    internalResourceId: String,
    listener: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener] = None,
    certificates: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate.Builder
      .create(stackCtx, internalResourceId)
      .listener(listener.orNull)
      .certificates(certificates.map(_.asJava).orNull)
      .build()
}
