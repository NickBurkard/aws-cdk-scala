package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ViewerCertificateProperty {

  def apply(
    sslSupportMethod: Option[String] = None,
    cloudFrontDefaultCertificate: Option[Boolean] = None,
    iamCertificateId: Option[String] = None,
    minimumProtocolVersion: Option[String] = None,
    acmCertificateArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder)
      .sslSupportMethod(sslSupportMethod.orNull)
      .cloudFrontDefaultCertificate(cloudFrontDefaultCertificate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iamCertificateId(iamCertificateId.orNull)
      .minimumProtocolVersion(minimumProtocolVersion.orNull)
      .acmCertificateArn(acmCertificateArn.orNull)
      .build()
}
