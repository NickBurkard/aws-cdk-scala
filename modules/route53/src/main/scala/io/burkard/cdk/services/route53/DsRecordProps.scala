package io.burkard.cdk.services.route53

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DsRecordProps {

  def apply(
    recordName: Option[String] = None,
    comment: Option[String] = None,
    values: Option[List[String]] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  ): software.amazon.awscdk.services.route53.DsRecordProps =
    (new software.amazon.awscdk.services.route53.DsRecordProps.Builder)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .values(values.map(_.asJava).orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
