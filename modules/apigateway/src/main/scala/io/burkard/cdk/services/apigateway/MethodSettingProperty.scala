package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MethodSettingProperty {

  def apply(
    resourcePath: Option[String] = None,
    cacheTtlInSeconds: Option[Number] = None,
    throttlingBurstLimit: Option[Number] = None,
    httpMethod: Option[String] = None,
    dataTraceEnabled: Option[Boolean] = None,
    loggingLevel: Option[String] = None,
    throttlingRateLimit: Option[Number] = None,
    metricsEnabled: Option[Boolean] = None,
    cacheDataEncrypted: Option[Boolean] = None,
    cachingEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty =
    (new software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty.Builder)
      .resourcePath(resourcePath.orNull)
      .cacheTtlInSeconds(cacheTtlInSeconds.orNull)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .httpMethod(httpMethod.orNull)
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .metricsEnabled(metricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheDataEncrypted(cacheDataEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cachingEnabled(cachingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
