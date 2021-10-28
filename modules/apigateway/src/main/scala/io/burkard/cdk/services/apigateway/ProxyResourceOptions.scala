package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProxyResourceOptions {

  def apply(
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    anyMethod: Option[Boolean] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  ): software.amazon.awscdk.services.apigateway.ProxyResourceOptions =
    (new software.amazon.awscdk.services.apigateway.ProxyResourceOptions.Builder)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .anyMethod(anyMethod.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
