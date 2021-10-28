package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionConfigurationProperty {

  def apply(
    databasePort: Option[Number] = None,
    tableName: Option[String] = None,
    secretArn: Option[String] = None,
    databaseName: Option[String] = None,
    databaseHost: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.Builder)
      .databasePort(databasePort.orNull)
      .tableName(tableName.orNull)
      .secretArn(secretArn.orNull)
      .databaseName(databaseName.orNull)
      .databaseHost(databaseHost.orNull)
      .build()
}
