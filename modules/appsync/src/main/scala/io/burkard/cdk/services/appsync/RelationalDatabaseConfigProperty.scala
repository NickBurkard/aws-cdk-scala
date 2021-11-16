package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RelationalDatabaseConfigProperty {

  def apply(
    relationalDatabaseSourceType: String,
    rdsHttpEndpointConfig: Option[software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty] = None
  ): software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
    (new software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder)
      .relationalDatabaseSourceType(relationalDatabaseSourceType)
      .rdsHttpEndpointConfig(rdsHttpEndpointConfig.orNull)
      .build()
}
