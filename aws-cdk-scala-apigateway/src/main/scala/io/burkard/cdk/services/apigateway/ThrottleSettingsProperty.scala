package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ThrottleSettingsProperty {

  def apply(
    rateLimit: Option[Number] = None,
    burstLimit: Option[Number] = None
  ): software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnUsagePlan.ThrottleSettingsProperty.Builder)
      .rateLimit(rateLimit.orNull)
      .burstLimit(burstLimit.orNull)
      .build()
}
