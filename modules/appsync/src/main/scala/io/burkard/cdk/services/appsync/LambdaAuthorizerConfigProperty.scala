package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaAuthorizerConfigProperty {

  def apply(
    authorizerResultTtlInSeconds: Option[Number] = None,
    identityValidationExpression: Option[String] = None,
    authorizerUri: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder)
      .authorizerResultTtlInSeconds(authorizerResultTtlInSeconds.orNull)
      .identityValidationExpression(identityValidationExpression.orNull)
      .authorizerUri(authorizerUri.orNull)
      .build()
}
