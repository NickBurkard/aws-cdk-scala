package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Resource {

  def apply(
    internalResourceId: String,
    parent: software.amazon.awscdk.services.apigateway.IResource,
    pathPart: String,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Resource =
    software.amazon.awscdk.services.apigateway.Resource.Builder
      .create(stackCtx, internalResourceId)
      .parent(parent)
      .pathPart(pathPart)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
