package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CnameRecord {

  def apply(
    internalResourceId: String,
    recordName: Option[String] = None,
    domainName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CnameRecord =
    software.amazon.awscdk.services.route53.CnameRecord.Builder
      .create(stackCtx, internalResourceId)
      .recordName(recordName.orNull)
      .domainName(domainName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
