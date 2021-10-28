package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpIntegration {

  def apply(
    url: String,
    httpMethod: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    proxy: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.HttpIntegration =
    software.amazon.awscdk.services.apigateway.HttpIntegration.Builder
      .create(url)
      .httpMethod(httpMethod.orNull)
      .options(options.orNull)
      .proxy(proxy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
