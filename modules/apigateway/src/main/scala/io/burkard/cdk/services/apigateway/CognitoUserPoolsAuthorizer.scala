package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoUserPoolsAuthorizer {

  def apply(
    internalResourceId: String,
    cognitoUserPools: List[_ <: software.amazon.awscdk.services.cognito.IUserPool],
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer =
    software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .cognitoUserPools(cognitoUserPools.asJava)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .build()
}
