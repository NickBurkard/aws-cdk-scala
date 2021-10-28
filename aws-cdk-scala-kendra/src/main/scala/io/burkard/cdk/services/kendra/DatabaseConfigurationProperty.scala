package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseConfigurationProperty {

  def apply(
    aclConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty] = None,
    databaseEngineType: Option[String] = None,
    columnConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    sqlConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty] = None,
    connectionConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.Builder)
      .aclConfiguration(aclConfiguration.orNull)
      .databaseEngineType(databaseEngineType.orNull)
      .columnConfiguration(columnConfiguration.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .sqlConfiguration(sqlConfiguration.orNull)
      .connectionConfiguration(connectionConfiguration.orNull)
      .build()
}
