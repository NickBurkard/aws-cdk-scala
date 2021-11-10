package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiKeyOptions {

  def apply(
    description: Option[String] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    apiKeyName: Option[String] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    value: Option[String] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  ): software.amazon.awscdk.services.apigateway.ApiKeyOptions =
    (new software.amazon.awscdk.services.apigateway.ApiKeyOptions.Builder)
      .description(description.orNull)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .apiKeyName(apiKeyName.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .value(value.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
