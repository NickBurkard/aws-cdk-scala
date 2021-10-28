package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomEndpointOptions {

  def apply(
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    domainName: Option[String] = None,
    hostedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions =
    (new software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions.Builder)
      .certificate(certificate.orNull)
      .domainName(domainName.orNull)
      .hostedZone(hostedZone.orNull)
      .build()
}
