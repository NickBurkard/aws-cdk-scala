package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Method {

  def apply(
    internalResourceId: String,
    integration: Option[software.amazon.awscdk.services.apigateway.Integration] = None,
    httpMethod: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    resource: Option[software.amazon.awscdk.services.apigateway.IResource] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.Method =
    software.amazon.awscdk.services.apigateway.Method.Builder
      .create(stackCtx, internalResourceId)
      .integration(integration.orNull)
      .httpMethod(httpMethod.orNull)
      .options(options.orNull)
      .resource(resource.orNull)
      .build()
}
