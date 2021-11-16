package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationTrustConfig {

  def apply(
    tlsValidationTrust: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty
  ): software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig =
    (new software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig.Builder)
      .tlsValidationTrust(tlsValidationTrust)
      .build()
}
