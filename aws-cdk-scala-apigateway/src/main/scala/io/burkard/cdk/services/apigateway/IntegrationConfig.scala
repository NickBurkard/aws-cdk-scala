package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IntegrationConfig {

  def apply(
    integrationHttpMethod: Option[String] = None,
    uri: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    deploymentToken: Option[String] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.IntegrationType] = None
  ): software.amazon.awscdk.services.apigateway.IntegrationConfig =
    (new software.amazon.awscdk.services.apigateway.IntegrationConfig.Builder)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .deploymentToken(deploymentToken.orNull)
      .`type`(`type`.orNull)
      .build()
}
