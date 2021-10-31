package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidation {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.TlsValidationTrust] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.SubjectAlternativeNames] = None
  ): software.amazon.awscdk.services.appmesh.TlsValidation =
    (new software.amazon.awscdk.services.appmesh.TlsValidation.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
