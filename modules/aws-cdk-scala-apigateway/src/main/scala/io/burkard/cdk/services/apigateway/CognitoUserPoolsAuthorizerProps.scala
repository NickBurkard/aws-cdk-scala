package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoUserPoolsAuthorizerProps {

  def apply(
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    cognitoUserPools: Option[List[_ <: software.amazon.awscdk.services.cognito.IUserPool]] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.Builder)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .cognitoUserPools(cognitoUserPools.map(_.asJava).orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .build()
}
