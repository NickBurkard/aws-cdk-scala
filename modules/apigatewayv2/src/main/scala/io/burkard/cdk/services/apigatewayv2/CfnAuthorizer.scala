package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAuthorizer {

  def apply(
    internalResourceId: String,
    name: String,
    authorizerType: String,
    apiId: String,
    authorizerResultTtlInSeconds: Option[Number] = None,
    identitySource: Option[List[String]] = None,
    identityValidationExpression: Option[String] = None,
    authorizerPayloadFormatVersion: Option[String] = None,
    authorizerCredentialsArn: Option[String] = None,
    jwtConfiguration: Option[software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.JWTConfigurationProperty] = None,
    enableSimpleResponses: Option[Boolean] = None,
    authorizerUri: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer =
    software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .authorizerType(authorizerType)
      .apiId(apiId)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identitySource(identitySource.map(_.asJava).orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .authorizerPayloadFormatVersion(authorizerPayloadFormatVersion.orNull)
      .authorizerCredentialsArn(authorizerCredentialsArn.orNull)
      .jwtConfiguration(jwtConfiguration.orNull)
      .enableSimpleResponses(enableSimpleResponses.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authorizerUri(authorizerUri.orNull)
      .build()
}
