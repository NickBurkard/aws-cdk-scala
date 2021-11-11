package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteSettingsProperty {

  def apply(
    throttlingBurstLimit: Option[Number] = None,
    detailedMetricsEnabled: Option[Boolean] = None,
    dataTraceEnabled: Option[Boolean] = None,
    loggingLevel: Option[String] = None,
    throttlingRateLimit: Option[Number] = None
  ): software.amazon.awscdk.services.apigateway.CfnStageV2.RouteSettingsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnStageV2.RouteSettingsProperty.Builder)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .detailedMetricsEnabled(detailedMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .build()
}
