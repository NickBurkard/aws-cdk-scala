package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LimitsProperty {

  def apply(
    messagesPerSecond: Option[Number] = None,
    maximumDuration: Option[Number] = None,
    total: Option[Number] = None,
    daily: Option[Number] = None,
    session: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty.Builder)
      .messagesPerSecond(messagesPerSecond.orNull)
      .maximumDuration(maximumDuration.orNull)
      .total(total.orNull)
      .daily(daily.orNull)
      .session(session.orNull)
      .build()
}
