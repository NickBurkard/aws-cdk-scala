package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomEndpointOptions {

  def apply(
    domainName: String,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    hostedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions =
    (new software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions.Builder)
      .domainName(domainName)
      .certificate(certificate.orNull)
      .hostedZone(hostedZone.orNull)
      .build()
}
