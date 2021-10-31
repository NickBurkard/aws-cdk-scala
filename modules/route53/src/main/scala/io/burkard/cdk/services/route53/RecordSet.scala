package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordSet {

  def apply(
    internalResourceId: String,
    recordName: Option[String] = None,
    recordType: Option[software.amazon.awscdk.services.route53.RecordType] = None,
    comment: Option[String] = None,
    target: Option[software.amazon.awscdk.services.route53.RecordTarget] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.RecordSet =
    software.amazon.awscdk.services.route53.RecordSet.Builder
      .create(stackCtx, internalResourceId)
      .recordName(recordName.orNull)
      .recordType(recordType.orNull)
      .comment(comment.orNull)
      .target(target.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
