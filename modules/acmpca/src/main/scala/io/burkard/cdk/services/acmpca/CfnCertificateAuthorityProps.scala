package io.burkard.cdk.services.acmpca

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCertificateAuthorityProps {

  def apply(
    subject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.SubjectProperty,
    keyAlgorithm: String,
    signingAlgorithm: String,
    `type`: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    keyStorageSecurityStandard: Option[String] = None,
    revocationConfiguration: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.RevocationConfigurationProperty] = None,
    csrExtensions: Option[software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CsrExtensionsProperty] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps.Builder)
      .subject(subject)
      .keyAlgorithm(keyAlgorithm)
      .signingAlgorithm(signingAlgorithm)
      .`type`(`type`)
      .tags(tags.map(_.asJava).orNull)
      .keyStorageSecurityStandard(keyStorageSecurityStandard.orNull)
      .revocationConfiguration(revocationConfiguration.orNull)
      .csrExtensions(csrExtensions.orNull)
      .build()
}
