package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationContextSdsTrustProperty {

  def apply(
    secretName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextSdsTrustProperty.Builder)
      .secretName(secretName.orNull)
      .build()
}
