package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenSearchServiceConfigProperty {

  def apply(
    awsRegion: String,
    endpoint: String
  ): software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.Builder)
      .awsRegion(awsRegion)
      .endpoint(endpoint)
      .build()
}
