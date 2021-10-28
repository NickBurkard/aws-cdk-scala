package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecordSetProps {

  def apply(
    recordName: Option[String] = None,
    recordType: Option[software.amazon.awscdk.services.route53.RecordType] = None,
    comment: Option[String] = None,
    target: Option[software.amazon.awscdk.services.route53.RecordTarget] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.RecordSetProps =
    (new software.amazon.awscdk.services.route53.RecordSetProps.Builder)
      .recordName(recordName.orNull)
      .recordType(recordType.orNull)
      .comment(comment.orNull)
      .target(target.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
