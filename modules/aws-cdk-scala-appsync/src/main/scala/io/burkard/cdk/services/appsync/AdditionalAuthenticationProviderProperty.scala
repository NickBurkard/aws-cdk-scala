package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdditionalAuthenticationProviderProperty {

  def apply(
    authenticationType: Option[String] = None,
    openIdConnectConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.OpenIDConnectConfigProperty] = None,
    lambdaAuthorizerConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty] = None,
    userPoolConfig: Option[software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder)
      .authenticationType(authenticationType.orNull)
      .openIdConnectConfig(openIdConnectConfig.orNull)
      .lambdaAuthorizerConfig(lambdaAuthorizerConfig.orNull)
      .userPoolConfig(userPoolConfig.orNull)
      .build()
}
