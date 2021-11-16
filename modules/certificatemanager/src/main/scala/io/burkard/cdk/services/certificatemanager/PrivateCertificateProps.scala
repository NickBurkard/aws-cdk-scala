package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateCertificateProps {

  def apply(
    certificateAuthority: software.amazon.awscdk.services.acmpca.ICertificateAuthority,
    domainName: String,
    subjectAlternativeNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.Builder)
      .certificateAuthority(certificateAuthority)
      .domainName(domainName)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .build()
}
