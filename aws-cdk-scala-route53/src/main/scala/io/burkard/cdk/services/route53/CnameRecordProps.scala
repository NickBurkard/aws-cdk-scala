package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CnameRecordProps {

  def apply(
    recordName: Option[String] = None,
    domainName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.CnameRecordProps =
    (new software.amazon.awscdk.services.route53.CnameRecordProps.Builder)
      .recordName(recordName.orNull)
      .domainName(domainName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
