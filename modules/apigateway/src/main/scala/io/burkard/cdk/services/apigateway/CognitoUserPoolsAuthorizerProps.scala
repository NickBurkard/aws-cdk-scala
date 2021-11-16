package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoUserPoolsAuthorizerProps {

  def apply(
    cognitoUserPools: List[_ <: software.amazon.awscdk.services.cognito.IUserPool],
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps.Builder)
      .cognitoUserPools(cognitoUserPools.asJava)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .build()
}
