package io.burkard.cdk.services.certificatemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateCertificateProps {

  def apply(
    certificateAuthority: Option[software.amazon.awscdk.services.acmpca.ICertificateAuthority] = None,
    domainName: Option[String] = None,
    subjectAlternativeNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps =
    (new software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps.Builder)
      .certificateAuthority(certificateAuthority.orNull)
      .domainName(domainName.orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .build()
}
