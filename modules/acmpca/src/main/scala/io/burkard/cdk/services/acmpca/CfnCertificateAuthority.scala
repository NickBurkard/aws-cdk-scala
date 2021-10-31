package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCertificateAuthority {

  def apply(
    internalResourceId: String,
    subject: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    keyAlgorithm: Option[String] = None,
    signingAlgorithm: Option[String] = None,
    `type`: Option[String] = None,
    keyStorageSecurityStandard: Option[String] = None,
    revocationConfiguration: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty] = None,
    csrExtensions: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority =
    software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.Builder
      .create(stackCtx, internalResourceId)
      .subject(subject.orNull)
      .tags(tags.map(_.asJava).orNull)
      .keyAlgorithm(keyAlgorithm.orNull)
      .signingAlgorithm(signingAlgorithm.orNull)
      .`type`(`type`.orNull)
      .keyStorageSecurityStandard(keyStorageSecurityStandard.orNull)
      .revocationConfiguration(revocationConfiguration.orNull)
      .csrExtensions(csrExtensions.orNull)
      .build()
}
