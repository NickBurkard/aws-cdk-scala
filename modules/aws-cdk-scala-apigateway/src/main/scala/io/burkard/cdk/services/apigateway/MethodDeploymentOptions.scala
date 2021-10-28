package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MethodDeploymentOptions {

  def apply(
    throttlingBurstLimit: Option[Number] = None,
    dataTraceEnabled: Option[Boolean] = None,
    loggingLevel: Option[software.amazon.awscdk.services.apigateway.MethodLoggingLevel] = None,
    throttlingRateLimit: Option[Number] = None,
    metricsEnabled: Option[Boolean] = None,
    cacheDataEncrypted: Option[Boolean] = None,
    cacheTtl: Option[software.amazon.awscdk.Duration] = None,
    cachingEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.MethodDeploymentOptions =
    (new software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.Builder)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .metricsEnabled(metricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheDataEncrypted(cacheDataEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheTtl(cacheTtl.orNull)
      .cachingEnabled(cachingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
