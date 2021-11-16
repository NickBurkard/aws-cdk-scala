package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpsRedirectProps {

  def apply(
    targetDomain: String,
    zone: software.amazon.awscdk.services.route53.IHostedZone,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    recordNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps =
    (new software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps.Builder)
      .targetDomain(targetDomain)
      .zone(zone)
      .certificate(certificate.orNull)
      .recordNames(recordNames.map(_.asJava).orNull)
      .build()
}
