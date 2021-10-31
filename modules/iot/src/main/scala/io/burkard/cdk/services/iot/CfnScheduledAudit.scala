package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScheduledAudit {

  def apply(
    internalResourceId: String,
    targetCheckNames: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dayOfMonth: Option[String] = None,
    frequency: Option[String] = None,
    scheduledAuditName: Option[String] = None,
    dayOfWeek: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnScheduledAudit =
    software.amazon.awscdk.services.iot.CfnScheduledAudit.Builder
      .create(stackCtx, internalResourceId)
      .targetCheckNames(targetCheckNames.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .dayOfMonth(dayOfMonth.orNull)
      .frequency(frequency.orNull)
      .scheduledAuditName(scheduledAuditName.orNull)
      .dayOfWeek(dayOfWeek.orNull)
      .build()
}
