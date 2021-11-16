package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordSet {

  def apply(
    internalResourceId: String,
    recordType: software.amazon.awscdk.services.route53.RecordType,
    target: software.amazon.awscdk.services.route53.RecordTarget,
    recordName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.RecordSet =
    software.amazon.awscdk.services.route53.RecordSet.Builder
      .create(stackCtx, internalResourceId)
      .recordType(recordType)
      .target(target)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
