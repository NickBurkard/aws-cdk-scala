package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScheduledAuditProps {

  def apply(
    targetCheckNames: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dayOfMonth: Option[String] = None,
    frequency: Option[String] = None,
    scheduledAuditName: Option[String] = None,
    dayOfWeek: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnScheduledAuditProps =
    (new software.amazon.awscdk.services.iot.CfnScheduledAuditProps.Builder)
      .targetCheckNames(targetCheckNames.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .dayOfMonth(dayOfMonth.orNull)
      .frequency(frequency.orNull)
      .scheduledAuditName(scheduledAuditName.orNull)
      .dayOfWeek(dayOfWeek.orNull)
      .build()
}