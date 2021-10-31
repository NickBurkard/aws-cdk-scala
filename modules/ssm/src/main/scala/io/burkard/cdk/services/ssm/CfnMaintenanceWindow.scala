package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaintenanceWindow {

  def apply(
    internalResourceId: String,
    scheduleTimezone: Option[String] = None,
    duration: Option[Number] = None,
    name: Option[String] = None,
    endDate: Option[String] = None,
    scheduleOffset: Option[Number] = None,
    cutoff: Option[Number] = None,
    schedule: Option[String] = None,
    startDate: Option[String] = None,
    allowUnassociatedTargets: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnMaintenanceWindow =
    software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder
      .create(stackCtx, internalResourceId)
      .scheduleTimezone(scheduleTimezone.orNull)
      .duration(duration.orNull)
      .name(name.orNull)
      .endDate(endDate.orNull)
      .scheduleOffset(scheduleOffset.orNull)
      .cutoff(cutoff.orNull)
      .schedule(schedule.orNull)
      .startDate(startDate.orNull)
      .allowUnassociatedTargets(allowUnassociatedTargets.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
