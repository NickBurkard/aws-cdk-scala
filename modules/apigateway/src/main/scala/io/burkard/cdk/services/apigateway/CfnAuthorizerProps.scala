package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAuthorizerProps {

  def apply(
    authorizerResultTtlInSeconds: Option[Number] = None,
    identitySource: Option[String] = None,
    providerArns: Option[List[String]] = None,
    authType: Option[String] = None,
    identityValidationExpression: Option[String] = None,
    authorizerUri: Option[String] = None,
    `type`: Option[String] = None,
    restApiId: Option[String] = None,
    name: Option[String] = None,
    authorizerCredentials: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.CfnAuthorizerProps.Builder)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identitySource(identitySource.orNull)
      .providerArns(providerArns.map(_.asJava).orNull)
      .authType(authType.orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .authorizerUri(authorizerUri.orNull)
      .`type`(`type`.orNull)
      .restApiId(restApiId.orNull)
      .name(name.orNull)
      .authorizerCredentials(authorizerCredentials.orNull)
      .build()
}
