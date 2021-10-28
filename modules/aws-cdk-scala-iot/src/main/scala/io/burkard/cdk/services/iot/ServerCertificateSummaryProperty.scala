package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServerCertificateSummaryProperty {

  def apply(
    serverCertificateStatusDetail: Option[String] = None,
    serverCertificateArn: Option[String] = None,
    serverCertificateStatus: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty =
    (new software.amazon.awscdk.services.iot.CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder)
      .serverCertificateStatusDetail(serverCertificateStatusDetail.orNull)
      .serverCertificateArn(serverCertificateArn.orNull)
      .serverCertificateStatus(serverCertificateStatus.orNull)
      .build()
}
