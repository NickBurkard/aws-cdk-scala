package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsProperty {

  def apply(
    certificate: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsCertificateProperty,
    mode: String,
    validation: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty.Builder)
      .certificate(certificate)
      .mode(mode)
      .validation(validation.orNull)
      .build()
}
