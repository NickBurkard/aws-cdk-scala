package io.burkard.cdk.services.certificatemanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CertificateProps {

  def apply(
    domainName: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  ): software.amazon.awscdk.services.certificatemanager.CertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder)
      .domainName(domainName.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .validation(validation.orNull)
      .build()
}
