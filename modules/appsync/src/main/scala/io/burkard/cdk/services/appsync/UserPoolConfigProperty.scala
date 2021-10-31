package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserPoolConfigProperty {

  def apply(
    userPoolId: Option[String] = None,
    appIdClientRegex: Option[String] = None,
    defaultAction: Option[String] = None,
    awsRegion: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLApi.UserPoolConfigProperty.Builder)
      .userPoolId(userPoolId.orNull)
      .appIdClientRegex(appIdClientRegex.orNull)
      .defaultAction(defaultAction.orNull)
      .awsRegion(awsRegion.orNull)
      .build()
}
