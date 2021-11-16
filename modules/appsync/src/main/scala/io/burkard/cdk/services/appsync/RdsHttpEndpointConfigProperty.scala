package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RdsHttpEndpointConfigProperty {

  def apply(
    dbClusterIdentifier: String,
    awsRegion: String,
    awsSecretStoreArn: String,
    databaseName: Option[String] = None,
    schema: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder)
      .dbClusterIdentifier(dbClusterIdentifier)
      .awsRegion(awsRegion)
      .awsSecretStoreArn(awsSecretStoreArn)
      .databaseName(databaseName.orNull)
      .schema(schema.orNull)
      .build()
}
