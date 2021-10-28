package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntegrationProps {

  def apply(
    integrationHttpMethod: Option[String] = None,
    uri: Option[AnyRef] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.IntegrationType] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationProps =
    (new software.amazon.awscdk.services.apigateway.IntegrationProps.Builder)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .`type`(`type`.orNull)
      .build()
}
