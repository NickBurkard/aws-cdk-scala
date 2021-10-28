package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthorizationConfigProperty {

  def apply(
    authorizationType: Option[String] = None,
    awsIamConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder)
      .authorizationType(authorizationType.orNull)
      .awsIamConfig(awsIamConfig.orNull)
      .build()
}
