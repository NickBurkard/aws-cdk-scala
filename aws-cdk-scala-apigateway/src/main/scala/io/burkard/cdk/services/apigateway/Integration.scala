package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Integration {

  def apply(
    integrationHttpMethod: Option[String] = None,
    uri: Option[AnyRef] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    `type`: Option[software.amazon.awscdk.services.apigateway.IntegrationType] = None
  ): software.amazon.awscdk.services.apigateway.Integration =
    software.amazon.awscdk.services.apigateway.Integration.Builder
      .create()
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .uri(uri.orNull)
      .options(options.orNull)
      .`type`(`type`.orNull)
      .build()
}
