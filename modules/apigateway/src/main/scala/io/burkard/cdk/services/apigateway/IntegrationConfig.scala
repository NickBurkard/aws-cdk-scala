package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntegrationConfig {

  def apply(
    `type`: software.amazon.awscdk.services.apigateway.IntegrationType,
    integrationHttpMethod: Option[String] = None,
    uri: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    deploymentToken: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationConfig =
    (new software.amazon.awscdk.services.apigateway.IntegrationConfig.Builder)
      .`type`(`type`)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .deploymentToken(deploymentToken.orNull)
      .build()
}
