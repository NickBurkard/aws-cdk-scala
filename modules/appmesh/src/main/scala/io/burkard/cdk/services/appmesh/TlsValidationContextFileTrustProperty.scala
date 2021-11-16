package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationContextFileTrustProperty {

  def apply(
    certificateChain: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextFileTrustProperty.Builder)
      .certificateChain(certificateChain)
      .build()
}
