package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsValidatedCertificateProps {

  def apply(
    hostedZone: software.amazon.awscdk.services.route53.IHostedZone,
    route53Endpoint: Option[String] = None,
    domainName: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    region: Option[String] = None,
    customResourceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  ): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder)
      .hostedZone(hostedZone)
      .route53Endpoint(route53Endpoint.orNull)
      .domainName(domainName.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .region(region.orNull)
      .customResourceRole(customResourceRole.orNull)
      .validation(validation.orNull)
      .build()
}
