package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CognitoUserPoolConfigProperty {

  def apply(
    userPoolId: Option[String] = None,
    appIdClientRegex: Option[String] = None,
    awsRegion: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.CognitoUserPoolConfigProperty.Builder)
      .userPoolId(userPoolId.orNull)
      .appIdClientRegex(appIdClientRegex.orNull)
      .awsRegion(awsRegion.orNull)
      .build()
}
