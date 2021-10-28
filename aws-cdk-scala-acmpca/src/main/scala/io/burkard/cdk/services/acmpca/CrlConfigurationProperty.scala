package io.burkard.cdk.services.acmpca

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CrlConfigurationProperty {

  def apply(
    expirationInDays: Option[Number] = None,
    enabled: Option[Boolean] = None,
    s3BucketName: Option[String] = None,
    s3ObjectAcl: Option[String] = None,
    customCname: Option[String] = None
  ): software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty =
    (new software.amazon.awscdk.services.acmpca.CfnCertificateAuthority.CrlConfigurationProperty.Builder)
      .expirationInDays(expirationInDays.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3BucketName(s3BucketName.orNull)
      .s3ObjectAcl(s3ObjectAcl.orNull)
      .customCname(customCname.orNull)
      .build()
}
