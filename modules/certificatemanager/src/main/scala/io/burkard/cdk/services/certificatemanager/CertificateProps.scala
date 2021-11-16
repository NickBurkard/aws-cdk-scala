package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CertificateProps {

  def apply(
    domainName: String,
    validationMethod: Option[software.amazon.awscdk.services.certificatemanager.ValidationMethod] = None,
    validationDomains: Option[Map[String, String]] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  ): software.amazon.awscdk.services.certificatemanager.CertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.CertificateProps.Builder)
      .domainName(domainName)
      .validationMethod(validationMethod.orNull)
      .validationDomains(validationDomains.map(_.asJava).orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .validation(validation.orNull)
      .build()
}
