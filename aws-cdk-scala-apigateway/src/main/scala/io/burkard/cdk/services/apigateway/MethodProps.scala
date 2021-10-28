package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MethodProps {

  def apply(
    integration: Option[software.amazon.awscdk.services.apigateway.Integration] = None,
    httpMethod: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    resource: Option[software.amazon.awscdk.services.apigateway.IResource] = None
  ): software.amazon.awscdk.services.apigateway.MethodProps =
    (new software.amazon.awscdk.services.apigateway.MethodProps.Builder)
      .integration(integration.orNull)
      .httpMethod(httpMethod.orNull)
      .options(options.orNull)
      .resource(resource.orNull)
      .build()
}
