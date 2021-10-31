package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificate {

  def apply(
    internalResourceId: String,
    domainValidationOptions: Option[List[_]] = None,
    validationMethod: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    certificateAuthorityArn: Option[String] = None,
    domainName: Option[String] = None,
    certificateTransparencyLoggingPreference: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.CfnCertificate =
    software.amazon.awscdk.services.certificatemanager.CfnCertificate.Builder
      .create(stackCtx, internalResourceId)
      .domainValidationOptions(domainValidationOptions.map(_.asJava).orNull)
      .validationMethod(validationMethod.orNull)
      .tags(tags.map(_.asJava).orNull)
      .certificateAuthorityArn(certificateAuthorityArn.orNull)
      .domainName(domainName.orNull)
      .certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .build()
}
