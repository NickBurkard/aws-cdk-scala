package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateCertificate {

  def apply(
    internalResourceId: String,
    certificateAuthority: software.amazon.awscdk.services.acmpca.ICertificateAuthority,
    domainName: String,
    subjectAlternativeNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.PrivateCertificate =
    software.amazon.awscdk.services.certificatemanager.PrivateCertificate.Builder
      .create(stackCtx, internalResourceId)
      .certificateAuthority(certificateAuthority)
      .domainName(domainName)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .build()
}
