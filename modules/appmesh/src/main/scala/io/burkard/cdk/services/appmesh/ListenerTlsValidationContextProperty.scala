package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerTlsValidationContextProperty {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextTrustProperty] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsValidationContextProperty.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
