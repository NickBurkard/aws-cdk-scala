package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Certificate {

  def apply(
    internalResourceId: String,
    domainName: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None,
    validation: Option[software.amazon.awscdk.services.certificatemanager.CertificateValidation] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.Certificate =
    software.amazon.awscdk.services.certificatemanager.Certificate.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .validation(validation.orNull)
      .build()
}
