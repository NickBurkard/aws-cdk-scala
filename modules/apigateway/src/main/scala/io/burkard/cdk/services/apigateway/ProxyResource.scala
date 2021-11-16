package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProxyResource {

  def apply(
    internalResourceId: String,
    parent: software.amazon.awscdk.services.apigateway.IResource,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    anyMethod: Option[Boolean] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.ProxyResource =
    software.amazon.awscdk.services.apigateway.ProxyResource.Builder
      .create(stackCtx, internalResourceId)
      .parent(parent)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .anyMethod(anyMethod.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
