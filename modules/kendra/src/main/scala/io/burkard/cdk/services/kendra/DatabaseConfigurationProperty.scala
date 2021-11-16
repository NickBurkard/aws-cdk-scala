package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseConfigurationProperty {

  def apply(
    databaseEngineType: String,
    columnConfiguration: software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty,
    connectionConfiguration: software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty,
    aclConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    sqlConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.Builder)
      .databaseEngineType(databaseEngineType)
      .columnConfiguration(columnConfiguration)
      .connectionConfiguration(connectionConfiguration)
      .aclConfiguration(aclConfiguration.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .sqlConfiguration(sqlConfiguration.orNull)
      .build()
}
