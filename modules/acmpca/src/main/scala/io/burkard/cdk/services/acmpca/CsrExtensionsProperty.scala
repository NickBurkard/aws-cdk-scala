package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CsrExtensionsProperty {

  def apply(
    keyUsage: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.KeyUsageProperty] = None,
    subjectInformationAccess: Option[List[_]] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty.Builder)
      .keyUsage(keyUsage.orNull)
      .subjectInformationAccess(subjectInformationAccess.map(_.asJava).orNull)
      .build()
}
