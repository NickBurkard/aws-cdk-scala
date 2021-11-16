package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionConfigurationProperty {

  def apply(
    databasePort: Number,
    tableName: String,
    secretArn: String,
    databaseName: String,
    databaseHost: String
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.Builder)
      .databasePort(databasePort)
      .tableName(tableName)
      .secretArn(secretArn)
      .databaseName(databaseName)
      .databaseHost(databaseHost)
      .build()
}
