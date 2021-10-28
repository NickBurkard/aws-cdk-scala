package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MutualTlsValidation {

  def apply(
    trust: Option[software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust] = None,
    subjectAlternativeNames: Option[software.amazon.awscdk.services.appmesh.SubjectAlternativeNames] = None
  ): software.amazon.awscdk.services.appmesh.MutualTlsValidation =
    (new software.amazon.awscdk.services.appmesh.MutualTlsValidation.Builder)
      .trust(trust.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.orNull)
      .build()
}
