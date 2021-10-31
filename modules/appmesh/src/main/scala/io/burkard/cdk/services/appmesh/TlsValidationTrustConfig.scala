package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationTrustConfig {

  def apply(
    tlsValidationTrust: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty] = None
  ): software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig =
    (new software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig.Builder)
      .tlsValidationTrust(tlsValidationTrust.orNull)
      .build()
}
