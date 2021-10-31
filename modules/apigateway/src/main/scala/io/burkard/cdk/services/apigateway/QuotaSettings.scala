package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QuotaSettings {

  def apply(
    offset: Option[Number] = None,
    limit: Option[Number] = None,
    period: Option[software.amazon.awscdk.services.apigateway.Period] = None
  ): software.amazon.awscdk.services.apigateway.QuotaSettings =
    (new software.amazon.awscdk.services.apigateway.QuotaSettings.Builder)
      .offset(offset.orNull)
      .limit(limit.orNull)
      .period(period.orNull)
      .build()
}
