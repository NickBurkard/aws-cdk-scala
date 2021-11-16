package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MethodProps {

  def apply(
    httpMethod: String,
    resource: software.amazon.awscdk.services.apigateway.IResource,
    integration: Option[software.amazon.awscdk.services.apigateway.Integration] = None,
    options: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None
  ): software.amazon.awscdk.services.apigateway.MethodProps =
    (new software.amazon.awscdk.services.apigateway.MethodProps.Builder)
      .httpMethod(httpMethod)
      .resource(resource)
      .integration(integration.orNull)
      .options(options.orNull)
      .build()
}
