package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntegrationProps {

  def apply(
    `type`: software.amazon.awscdk.services.apigateway.IntegrationType,
    integrationHttpMethod: Option[String] = None,
    uri: Option[AnyRef] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationProps =
    (new software.amazon.awscdk.services.apigateway.IntegrationProps.Builder)
      .`type`(`type`)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .build()
}
