package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpConfigProperty {

  def apply(
    endpoint: String,
    authorizationConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder)
      .endpoint(endpoint)
      .authorizationConfig(authorizationConfig.orNull)
      .build()
}
