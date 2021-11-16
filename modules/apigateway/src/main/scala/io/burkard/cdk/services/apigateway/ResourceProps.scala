package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceProps {

  def apply(
    parent: software.amazon.awscdk.services.apigateway.IResource,
    pathPart: String,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  ): software.amazon.awscdk.services.apigateway.ResourceProps =
    (new software.amazon.awscdk.services.apigateway.ResourceProps.Builder)
      .parent(parent)
      .pathPart(pathPart)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
