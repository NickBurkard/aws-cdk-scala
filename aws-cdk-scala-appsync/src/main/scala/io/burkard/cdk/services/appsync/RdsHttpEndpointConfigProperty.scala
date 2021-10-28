package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RdsHttpEndpointConfigProperty {

  def apply(
    dbClusterIdentifier: Option[String] = None,
    awsRegion: Option[String] = None,
    databaseName: Option[String] = None,
    awsSecretStoreArn: Option[String] = None,
    schema: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder)
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .awsRegion(awsRegion.orNull)
      .databaseName(databaseName.orNull)
      .awsSecretStoreArn(awsSecretStoreArn.orNull)
      .schema(schema.orNull)
      .build()
}
