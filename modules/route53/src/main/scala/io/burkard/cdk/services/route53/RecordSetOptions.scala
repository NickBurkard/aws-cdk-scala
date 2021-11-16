package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecordSetOptions {

  def apply(
    zone: software.amazon.awscdk.services.route53.IHostedZone,
    recordName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.route53.RecordSetOptions =
    (new software.amazon.awscdk.services.route53.RecordSetOptions.Builder)
      .zone(zone)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .build()
}
