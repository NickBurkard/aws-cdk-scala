package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsValidatedCertificate {

  def apply(
    internalResourceId: String,
    hostedZone: software.amazon.awscdk.services.route53.IHostedZone,
    route53Endpoint: Option[String] = None,
    domainName: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    region: Option[String] = None,
    customResourceRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate =
    software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate.Builder
      .create(stackCtx, internalResourceId)
      .hostedZone(hostedZone)
      .route53Endpoint(route53Endpoint.orNull)
      .domainName(domainName.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .region(region.orNull)
      .customResourceRole(customResourceRole.orNull)
      .validation(validation.orNull)
      .build()
}
