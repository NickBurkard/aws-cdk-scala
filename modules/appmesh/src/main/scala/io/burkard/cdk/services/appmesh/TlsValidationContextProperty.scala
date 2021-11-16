package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidationContextProperty {

  def apply(
    trust: software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.Builder)
      .trust(trust)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
