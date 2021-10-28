package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TlsValidationContextProperty {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextTrustProperty] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNamesProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TlsValidationContextProperty.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
