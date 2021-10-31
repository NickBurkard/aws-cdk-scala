package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExtensionsProperty {

  def apply(
    keyUsage: Option[software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty] = None,
    extendedKeyUsage: Option[List[_]] = None,
    subjectAlternativeNames: Option[List[_]] = None,
    certificatePolicies: Option[List[_]] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty.Builder)
      .keyUsage(keyUsage.orNull)
      .extendedKeyUsage(extendedKeyUsage.map(_.asJava).orNull)
      .subjectAlternativeNames(subjectAlternativeNames.map(_.asJava).orNull)
      .certificatePolicies(certificatePolicies.map(_.asJava).orNull)
      .build()
}
