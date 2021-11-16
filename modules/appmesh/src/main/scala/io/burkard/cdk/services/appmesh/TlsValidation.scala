package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TlsValidation {

  def apply(
    trust: software.amazon.awscdk.services.appmesh.TlsValidationTrust,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.SubjectAlternativeNames] = None
  ): software.amazon.awscdk.services.appmesh.TlsValidation =
    (new software.amazon.awscdk.services.appmesh.TlsValidation.Builder)
      .trust(trust)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
