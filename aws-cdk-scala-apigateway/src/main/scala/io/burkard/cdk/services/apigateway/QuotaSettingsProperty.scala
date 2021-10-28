package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QuotaSettingsProperty {

  def apply(
    offset: Option[Number] = None,
    limit: Option[Number] = None,
    period: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlan.QuotaSettingsProperty.Builder)
      .offset(offset.orNull)
      .limit(limit.orNull)
      .period(period.orNull)
      .build()
}
