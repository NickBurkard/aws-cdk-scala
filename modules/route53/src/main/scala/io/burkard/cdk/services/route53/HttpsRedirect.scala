package io.burkard.cdk.services.route53

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpsRedirect {

  def apply(
    internalResourceId: String,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    targetDomain: Option[String] = None,
    recordNames: Option[List[String]] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.patterns.HttpsRedirect =
    software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder
      .create(stackCtx, internalResourceId)
      .certificate(certificate.orNull)
      .targetDomain(targetDomain.orNull)
      .recordNames(recordNames.map(_.asJava).orNull)
      .zone(zone.orNull)
      .build()
}