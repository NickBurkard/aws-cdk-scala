package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuthorizationConfigProperty {

  def apply(
    authorizationType: String,
    awsIamConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder)
      .authorizationType(authorizationType)
      .awsIamConfig(awsIamConfig.orNull)
      .build()
}
