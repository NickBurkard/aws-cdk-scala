package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WriteTreatmentResourceProperty {

  def apply(
    treatmentDescription: Option[String] = None,
    treatmentName: Option[String] = None,
    sizePercent: Option[Number] = None,
    messageConfiguration: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty] = None,
    schedule: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty.Builder)
      .treatmentDescription(treatmentDescription.orNull)
      .treatmentName(treatmentName.orNull)
      .sizePercent(sizePercent.orNull)
      .messageConfiguration(messageConfiguration.orNull)
      .schedule(schedule.orNull)
      .build()
}
