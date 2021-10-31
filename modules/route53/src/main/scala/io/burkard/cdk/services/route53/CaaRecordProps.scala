package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaaRecordProps {

  def apply(
    recordName: Option[String] = None,
    comment: Option[String] = None,
    values: Option[List[_ <: software.amazon.awscdk.services.route53.CaaRecordValue]] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.CaaRecordProps =
    (new software.amazon.awscdk.services.route53.CaaRecordProps.Builder)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .values(values.map(_.asJava).orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
