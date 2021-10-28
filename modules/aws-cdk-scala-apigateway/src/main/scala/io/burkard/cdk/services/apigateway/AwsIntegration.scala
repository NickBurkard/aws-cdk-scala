package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsIntegration {

  def apply(
    integrationHttpMethod: Option[String] = None,
    path: Option[String] = None,
    proxy: Option[Boolean] = None,
    region: Option[String] = None,
    action: Option[String] = None,
    service: Option[String] = None,
    subdomain: Option[String] = None,
    actionParameters: Option[Map[String, String]] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None
  ): software.amazon.awscdk.services.apigateway.AwsIntegration =
    software.amazon.awscdk.services.apigateway.AwsIntegration.Builder
      .create()
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .path(path.orNull)
      .proxy(proxy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .region(region.orNull)
      .action(action.orNull)
      .service(service.orNull)
      .subdomain(subdomain.orNull)
      .actionParameters(actionParameters.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
