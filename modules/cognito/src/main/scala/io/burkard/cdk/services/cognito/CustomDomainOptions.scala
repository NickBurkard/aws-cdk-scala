package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomDomainOptions {

  def apply(
    certificate: software.amazon.awscdk.services.certificatemanager.ICertificate,
    domainName: String
  ): software.amazon.awscdk.services.cognito.CustomDomainOptions =
    (new software.amazon.awscdk.services.cognito.CustomDomainOptions.Builder)
      .certificate(certificate)
      .domainName(domainName)
      .build()
}
