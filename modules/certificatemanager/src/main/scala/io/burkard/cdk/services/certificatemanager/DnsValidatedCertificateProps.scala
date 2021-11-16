package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsValidatedCertificateProps {

  def apply(
    hostedZone: software.amazon.awscdk.services.route53.IHostedZone,
    domainName: Option[String] = None,
    validationDomains: Option[Map[String, String]] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    region: Option[String] = None,
    customResourceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None,
    route53Endpoint: Option[String] = None,
    validationMethod: Option[software.amazon.awscdk.services.certificatemanager.ValidationMethod] = None
  ): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps.Builder)
      .hostedZone(hostedZone)
      .domainName(domainName.orNull)
      .validationDomains(validationDomains.map(_.asJava).orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .region(region.orNull)
      .customResourceRole(customResourceRole.orNull)
      .validation(validation.orNull)
      .route53Endpoint(route53Endpoint.orNull)
      .validationMethod(validationMethod.orNull)
      .build()
}
