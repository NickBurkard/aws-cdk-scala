package io.burkard.cdk.services.certificatemanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DnsValidatedCertificateProps {

  def apply(
    route53Endpoint: Option[String] = None,
    domainName: Option[String] = None,
    hostedZone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    region: Option[String] = None,
    customResourceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  ): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder)
      .route53Endpoint(route53Endpoint.orNull)
      .domainName(domainName.orNull)
      .hostedZone(hostedZone.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .region(region.orNull)
      .customResourceRole(customResourceRole.orNull)
      .validation(validation.orNull)
      .build()
}
