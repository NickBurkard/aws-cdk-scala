package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RateLimitedApiKey {

  def apply(
    internalResourceId: String,
    quota: Option[software.amazon.awscdk.services.apigateway.QuotaSettings] = None,
    description: Option[String] = None,
    generateDistinctId: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    apiStages: Option[List[_ <: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage]] = None,
    apiKeyName: Option[String] = None,
    throttle: Option[software.amazon.awscdk.services.apigateway.ThrottleSettings] = None,
    customerId: Option[String] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    resources: Option[List[_ <: software.amazon.awscdk.services.apigateway.IRestApi]] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    value: Option[String] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.RateLimitedApiKey =
    software.amazon.awscdk.services.apigateway.RateLimitedApiKey.Builder
      .create(stackCtx, internalResourceId)
      .quota(quota.orNull)
      .description(description.orNull)
      .generateDistinctId(generateDistinctId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiStages(apiStages.map(_.asJava).orNull)
      .apiKeyName(apiKeyName.orNull)
      .throttle(throttle.orNull)
      .customerId(customerId.orNull)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .resources(resources.map(_.asJava).orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .value(value.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
