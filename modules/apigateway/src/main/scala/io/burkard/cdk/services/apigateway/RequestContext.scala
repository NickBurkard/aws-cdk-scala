package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestContext {

  def apply(
    stage: Option[Boolean] = None,
    cognitoIdentityPoolId: Option[Boolean] = None,
    cognitoIdentityId: Option[Boolean] = None,
    httpMethod: Option[Boolean] = None,
    apiKey: Option[Boolean] = None,
    authorizerPrincipalId: Option[Boolean] = None,
    apiId: Option[Boolean] = None,
    requestId: Option[Boolean] = None,
    userArn: Option[Boolean] = None,
    cognitoAuthenticationProvider: Option[Boolean] = None,
    caller: Option[Boolean] = None,
    resourcePath: Option[Boolean] = None,
    resourceId: Option[Boolean] = None,
    accountId: Option[Boolean] = None,
    userAgent: Option[Boolean] = None,
    sourceIp: Option[Boolean] = None,
    user: Option[Boolean] = None,
    cognitoAuthenticationType: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigateway.RequestContext =
    (new software.amazon.awscdk.services.apigateway.RequestContext.Builder)
      .stage(stage.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cognitoIdentityPoolId(cognitoIdentityPoolId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cognitoIdentityId(cognitoIdentityId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .httpMethod(httpMethod.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiKey(apiKey.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .authorizerPrincipalId(authorizerPrincipalId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiId(apiId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestId(requestId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userArn(userArn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cognitoAuthenticationProvider(cognitoAuthenticationProvider.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .caller(caller.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourcePath(resourcePath.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceId(resourceId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accountId(accountId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userAgent(userAgent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceIp(sourceIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .user(user.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cognitoAuthenticationType(cognitoAuthenticationType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
