package io.burkard.cdk.services.pinpoint

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCampaign {

  def apply(
    internalResourceId: String,
    messageConfiguration: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty,
    schedule: software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty,
    name: String,
    applicationId: String,
    segmentId: String,
    holdoutPercent: Option[Number] = None,
    treatmentDescription: Option[String] = None,
    treatmentName: Option[String] = None,
    additionalTreatments: Option[List[_]] = None,
    campaignHook: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty] = None,
    limits: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty] = None,
    isPaused: Option[Boolean] = None,
    priority: Option[Number] = None,
    segmentVersion: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnCampaign =
    software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder
      .create(stackCtx, internalResourceId)
      .messageConfiguration(messageConfiguration)
      .schedule(schedule)
      .name(name)
      .applicationId(applicationId)
      .segmentId(segmentId)
      .holdoutPercent(holdoutPercent.orNull)
      .treatmentDescription(treatmentDescription.orNull)
      .treatmentName(treatmentName.orNull)
      .additionalTreatments(additionalTreatments.map(_.asJava).orNull)
      .campaignHook(campaignHook.orNull)
      .limits(limits.orNull)
      .isPaused(isPaused.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .priority(priority.orNull)
      .segmentVersion(segmentVersion.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .build()
}
