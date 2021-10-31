package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZoneDelegationRecord {

  def apply(
    internalResourceId: String,
    recordName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    nameServers: Option[List[String]] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.ZoneDelegationRecord =
    software.amazon.awscdk.services.route53.ZoneDelegationRecord.Builder
      .create(stackCtx, internalResourceId)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .nameServers(nameServers.map(_.asJava).orNull)
      .zone(zone.orNull)
      .build()
}
