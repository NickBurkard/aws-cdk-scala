package io.burkard.cdk.services.pinpoint

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCampaignProps {

  def apply(
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
    segmentVersion: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    applicationId: Option[String] = None,
    segmentId: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaignProps =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaignProps.Builder)
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
      .segmentVersion(segmentVersion.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .applicationId(applicationId.orNull)
      .segmentId(segmentId.orNull)
      .build()
}
