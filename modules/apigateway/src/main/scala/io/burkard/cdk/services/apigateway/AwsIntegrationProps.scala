package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsIntegrationProps {

  def apply(
    service: String,
    integrationHttpMethod: Option[String] = None,
    path: Option[String] = None,
    proxy: Option[Boolean] = None,
    region: Option[String] = None,
    action: Option[String] = None,
    subdomain: Option[String] = None,
    actionParameters: Option[Map[String, String]] = None,
    options: Option[software.amazon.awscdk.services.apigateway.IntegrationOptions] = None
  ): software.amazon.awscdk.services.apigateway.AwsIntegrationProps =
    (new software.amazon.awscdk.services.apigateway.AwsIntegrationProps.Builder)
      .service(service)
      .integrationHttpMethod(integrationHttpMethod.orNull)
      .path(path.orNull)
      .proxy(proxy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .region(region.orNull)
      .action(action.orNull)
      .subdomain(subdomain.orNull)
      .actionParameters(actionParameters.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
