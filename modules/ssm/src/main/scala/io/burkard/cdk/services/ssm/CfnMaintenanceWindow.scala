package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaintenanceWindow {

  def apply(
    internalResourceId: String,
    duration: Number,
    name: String,
    cutoff: Number,
    schedule: String,
    allowUnassociatedTargets: Boolean,
    scheduleTimezone: Option[String] = None,
    endDate: Option[String] = None,
    scheduleOffset: Option[Number] = None,
    startDate: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnMaintenanceWindow =
    software.amazon.awscdk.services.ssm.CfnMaintenanceWindow.Builder
      .create(stackCtx, internalResourceId)
      .duration(duration)
      .name(name)
      .cutoff(cutoff)
      .schedule(schedule)
      .allowUnassociatedTargets(allowUnassociatedTargets)
      .scheduleTimezone(scheduleTimezone.orNull)
      .endDate(endDate.orNull)
      .scheduleOffset(scheduleOffset.orNull)
      .startDate(startDate.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
