package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiV2Props {

  def apply(
    body: Option[AnyRef] = None,
    name: Option[String] = None,
    corsConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnApiV2.CorsProperty] = None,
    apiKeySelectionExpression: Option[String] = None,
    failOnWarnings: Option[Boolean] = None,
    basePath: Option[String] = None,
    version: Option[String] = None,
    routeSelectionExpression: Option[String] = None,
    routeKey: Option[String] = None,
    target: Option[String] = None,
    bodyS3Location: Option[software.amazon.awscdk.services.apigateway.CfnApiV2.BodyS3LocationProperty] = None,
    description: Option[String] = None,
    disableSchemaValidation: Option[Boolean] = None,
    tags: Option[AnyRef] = None,
    credentialsArn: Option[String] = None,
    protocolType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnApiV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnApiV2Props.Builder)
      .body(body.orNull)
      .name(name.orNull)
      .corsConfiguration(corsConfiguration.orNull)
      .apiKeySelectionExpression(apiKeySelectionExpression.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .basePath(basePath.orNull)
      .version(version.orNull)
      .routeSelectionExpression(routeSelectionExpression.orNull)
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
