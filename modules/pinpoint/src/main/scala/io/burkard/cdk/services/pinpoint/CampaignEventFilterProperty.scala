package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CampaignEventFilterProperty {

  def apply(
    filterType: Option[String] = None,
    dimensions: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty.Builder)
      .filterType(filterType.orNull)
      .dimensions(dimensions.orNull)
      .build()
}
