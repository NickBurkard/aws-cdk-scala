package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificateProperty {

  def apply(
    certificateArn: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate.CertificateProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .build()
}
