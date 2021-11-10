package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCampaign {

  def apply(
    internalResourceId: String,
    holdoutPercent: Option[Number] = None,
    treatmentDescription: Option[String] = None,
    treatmentName: Option[String] = None,
    messageConfiguration: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty] = None,
    additionalTreatments: Option[List[_]] = None,
    schedule: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty] = None,
    campaignHook: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty] = None,
    limits: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty] = None,
    isPaused: Option[Boolean] = None,
    name: Option[String] = None,
    priority: Option[Number] = None,
    segmentVersion: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    applicationId: Option[String] = None,
    segmentId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnCampaign =
    software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder
      .create(stackCtx, internalResourceId)
      .holdoutPercent(holdoutPercent.orNull)
      .treatmentDescription(treatmentDescription.orNull)
      .treatmentName(treatmentName.orNull)
      .messageConfiguration(messageConfiguration.orNull)
      .additionalTreatments(additionalTreatments.map(_.asJava).orNull)
      .schedule(schedule.orNull)
      .campaignHook(campaignHook.orNull)
      .limits(limits.orNull)
      .isPaused(isPaused.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .priority(priority.orNull)
      .segmentVersion(segmentVersion.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .applicationId(applicationId.orNull)
      .segmentId(segmentId.orNull)
      .build()
}
