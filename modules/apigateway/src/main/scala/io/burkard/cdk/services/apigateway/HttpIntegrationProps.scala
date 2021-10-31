package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpIntegrationProps {

  def apply(
    httpMethod: Option[String] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None,
    proxy: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.HttpIntegrationProps =
    (new software.amazon.awscdk.services.apigateway.HttpIntegrationProps.Builder)
      .httpMethod(httpMethod.orNull)
      .options(options.orNull)
      .proxy(proxy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
