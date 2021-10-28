package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpConfigProperty {

  def apply(
    authorizationConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder)
      .authorizationConfig(authorizationConfig.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
