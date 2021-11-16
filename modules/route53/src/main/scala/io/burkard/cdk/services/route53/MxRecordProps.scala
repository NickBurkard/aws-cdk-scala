package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MxRecordProps {

  def apply(
    values: List[_ <: software.amazon.awscdk.services.route53.MxRecordValue],
    recordName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.MxRecordProps =
    (new software.amazon.awscdk.services.route53.MxRecordProps.Builder)
      .values(values.asJava)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
