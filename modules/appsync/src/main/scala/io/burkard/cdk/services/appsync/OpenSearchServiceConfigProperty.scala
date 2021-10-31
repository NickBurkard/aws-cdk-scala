package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenSearchServiceConfigProperty {

  def apply(
    awsRegion: Option[String] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.Builder)
      .awsRegion(awsRegion.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
