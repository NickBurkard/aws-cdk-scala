package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListenerCertificate {

  def apply(
    internalResourceId: String,
    listenerArn: String,
    certificates: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.Builder
      .create(stackCtx, internalResourceId)
      .listenerArn(listenerArn)
      .certificates(certificates.asJava)
      .build()
}
