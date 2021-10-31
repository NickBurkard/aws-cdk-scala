package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAuthorizerProps {

  def apply(
    name: Option[String] = None,
    authorizerType: Option[String] = None,
    authorizerResultTtlInSeconds: Option[Number] = None,
    identitySource: Option[List[String]] = None,
    identityValidationExpression: Option[String] = None,
    apiId: Option[String] = None,
    authorizerPayloadFormatVersion: Option[String] = None,
    authorizerCredentialsArn: Option[String] = None,
    jwtConfiguration: Option[software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty] = None,
    enableSimpleResponses: Option[Boolean] = None,
    authorizerUri: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps.Builder)
      .name(name.orNull)
      .authorizerType(authorizerType.orNull)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identitySource(identitySource.map(_.asJava).orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .apiId(apiId.orNull)
      .authorizerPayloadFormatVersion(authorizerPayloadFormatVersion.orNull)
      .authorizerCredentialsArn(authorizerCredentialsArn.orNull)
      .jwtConfiguration(jwtConfiguration.orNull)
      .enableSimpleResponses(enableSimpleResponses.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authorizerUri(authorizerUri.orNull)
      .build()
}
