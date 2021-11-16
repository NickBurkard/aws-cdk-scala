package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Method {

  def apply(
    internalResourceId: String,
    httpMethod: String,
    resource: software.amazon.awscdk.services.apigateway.IResource,
    integration: Option[software.amazon.awscdk.services.apigateway.Integration] = None,
    options: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Method =
    software.amazon.awscdk.services.apigateway.Method.Builder
      .create(stackCtx, internalResourceId)
      .httpMethod(httpMethod)
      .resource(resource)
      .integration(integration.orNull)
      .options(options.orNull)
      .build()
}
