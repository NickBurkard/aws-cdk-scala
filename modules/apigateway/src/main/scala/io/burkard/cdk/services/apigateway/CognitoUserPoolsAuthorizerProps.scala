package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
