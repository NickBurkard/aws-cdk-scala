package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticsearchConfigProperty {

  def apply(
    awsRegion: String,
    endpoint: String
  ): software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder)
      .awsRegion(awsRegion)
      .endpoint(endpoint)
      .build()
}
