package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpsRedirect {

  def apply(
    internalResourceId: String,
    targetDomain: String,
    zone: software.amazon.awscdk.services.route53.IHostedZone,
    certificate: Option[software.amazon.awscdk.services.certificatemanager.ICertificate] = None,
    recordNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.patterns.HttpsRedirect =
    software.amazon.awscdk.services.route53.patterns.HttpsRedirect.Builder
      .create(stackCtx, internalResourceId)
      .targetDomain(targetDomain)
      .zone(zone)
      .certificate(certificate.orNull)
      .recordNames(recordNames.map(_.asJava).orNull)
      .build()
}
