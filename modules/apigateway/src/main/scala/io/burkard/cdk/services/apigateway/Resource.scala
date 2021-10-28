package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Resource {

  def apply(
    internalResourceId: String,
    parent: Option[software.amazon.awscdk.services.apigateway.IResource] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    pathPart: Option[String] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Resource =
    software.amazon.awscdk.services.apigateway.Resource.Builder
      .create(stackCtx, internalResourceId)
      .parent(parent.orNull)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .pathPart(pathPart.orNull)
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
