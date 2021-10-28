package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteSettingsProperty {

  def apply(
    throttlingBurstLimit: Option[Number] = None,
    detailedMetricsEnabled: Option[Boolean] = None,
    dataTraceEnabled: Option[Boolean] = None,
    loggingLevel: Option[String] = None,
    throttlingRateLimit: Option[Number] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty.Builder)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .detailedMetricsEnabled(detailedMetricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .build()
}
