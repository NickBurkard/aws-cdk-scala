package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventDimensionsProperty {

  def apply(
    eventType: Option[software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty] = None,
    attributes: Option[AnyRef] = None,
    metrics: Option[AnyRef] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty.Builder)
      .eventType(eventType.orNull)
      .attributes(attributes.orNull)
      .metrics(metrics.orNull)
      .build()
}
