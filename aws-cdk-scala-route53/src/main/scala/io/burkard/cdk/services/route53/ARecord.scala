package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ARecord {

  def apply(
    internalResourceId: String,
    recordName: Option[String] = None,
    comment: Option[String] = None,
    target: Option[software.amazon.awscdk.services.route53.RecordTarget] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.ARecord =
    software.amazon.awscdk.services.route53.ARecord.Builder
      .create(stackCtx, internalResourceId)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .target(target.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
