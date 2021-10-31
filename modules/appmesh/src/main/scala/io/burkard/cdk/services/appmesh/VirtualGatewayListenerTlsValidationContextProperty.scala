package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerTlsValidationContextProperty {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.SubjectAlternativeNamesProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
