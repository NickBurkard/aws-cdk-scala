package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Integration {

  def apply(
    `type`: software.amazon.awscdk.services.apigateway.IntegrationType,
    integrationHttpMethod: Option[String] = None,
    uri: Option[AnyRef] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None
  ): software.amazon.awscdk.services.apigateway.Integration =
    software.amazon.awscdk.services.apigateway.Integration.Builder
      .create()
      .`type`(`type`)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .build()
}
