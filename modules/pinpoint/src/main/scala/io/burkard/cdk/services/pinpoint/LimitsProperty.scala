package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LimitsProperty {

  def apply(
    messagesPerSecond: Option[Number] = None,
    maximumDuration: Option[Number] = None,
    total: Option[Number] = None,
    daily: Option[Number] = None
  ): software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty.Builder)
      .messagesPerSecond(messagesPerSecond.orNull)
      .maximumDuration(maximumDuration.orNull)
      .total(total.orNull)
      .daily(daily.orNull)
      .build()
}
