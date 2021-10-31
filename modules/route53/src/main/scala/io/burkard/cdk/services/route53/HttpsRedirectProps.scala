package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpsRedirectProps {

  def apply(
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    targetDomain: Option[String] = None,
    recordNames: Option[List[String]] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps =
    (new software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.Builder)
      .certificate(certificate.orNull)
      .targetDomain(targetDomain.orNull)
      .recordNames(recordNames.map(_.asJava).orNull)
      .zone(zone.orNull)
      .build()
}
