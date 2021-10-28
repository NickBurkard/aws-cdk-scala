package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CognitoUserPoolsAuthorizer {

  def apply(
    internalResourceId: String,
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    cognitoUserPools: Option[List[_ <: software.amazon.awscdk.services.cognito.IUserPool]] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer =
    software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .cognitoUserPools(cognitoUserPools.map(_.asJava).orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .build()
}
