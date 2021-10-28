package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiProps {

  def apply(
    body: Option[AnyRef] = None,
    name: Option[String] = None,
    corsConfiguration: Option[software.amazon.awscdk.services.apigatewayv2.CfnApi.CorsProperty] = None,
    apiKeySelectionExpression: Option[String] = None,
    failOnWarnings: Option[Boolean] = None,
    basePath: Option[String] = None,
    version: Option[String] = None,
    routeSelectionExpression: Option[String] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    routeKey: Option[String] = None,
    target: Option[String] = None,
    bodyS3Location: Option[software.amazon.awscdk.services.apigatewayv2.CfnApi.BodyS3LocationProperty] = None,
    description: Option[String] = None,
    disableSchemaValidation: Option[Boolean] = None,
    tags: Option[AnyRef] = None,
    credentialsArn: Option[String] = None,
    protocolType: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiProps.Builder)
      .body(body.orNull)
      .name(name.orNull)
      .corsConfiguration(corsConfiguration.orNull)
      .apiKeySelectionExpression(apiKeySelectionExpression.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .basePath(basePath.orNull)
      .version(version.orNull)
      .routeSelectionExpression(routeSelectionExpression.orNull)
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .routeKey(routeKey.orNull)
      .target(target.orNull)
      .bodyS3Location(bodyS3Location.orNull)
      .description(description.orNull)
      .disableSchemaValidation(disableSchemaValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.orNull)
      .credentialsArn(credentialsArn.orNull)
      .protocolType(protocolType.orNull)
      .build()
}