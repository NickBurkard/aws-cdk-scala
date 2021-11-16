package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TxtRecord {

  def apply(
    internalResourceId: String,
    values: List[String],
    recordName: Option[String] = None,
    comment: Option[String] = None,
    ttl: Option[software.amazon.awscdk.Duration] = None,
    zone: Option[software.amazon.awscdk.services.route53.IHostedZone] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.TxtRecord =
    software.amazon.awscdk.services.route53.TxtRecord.Builder
      .create(stackCtx, internalResourceId)
      .values(values.asJava)
      .recordName(recordName.orNull)
      .comment(comment.orNull)
      .ttl(ttl.orNull)
      .zone(zone.orNull)
      .build()
}
