package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSourceParametersProperty {

  def apply(
    prestoParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty] = None,
    mySqlParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty] = None,
    s3Parameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty] = None,
    oracleParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty] = None,
    amazonElasticsearchParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty] = None,
    mariaDbParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty] = None,
    auroraPostgreSqlParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty] = None,
    snowflakeParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty] = None,
    teradataParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty] = None,
    sqlServerParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty] = None,
    redshiftParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty] = None,
    rdsParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty] = None,
    postgreSqlParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty] = None,
    athenaParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty] = None,
    sparkParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty] = None,
    auroraParameters: Option[software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty.Builder)
      .prestoParameters(prestoParameters.orNull)
      .mySqlParameters(mySqlParameters.orNull)
      .s3Parameters(s3Parameters.orNull)
      .oracleParameters(oracleParameters.orNull)
      .amazonElasticsearchParameters(amazonElasticsearchParameters.orNull)
      .mariaDbParameters(mariaDbParameters.orNull)
      .auroraPostgreSqlParameters(auroraPostgreSqlParameters.orNull)
      .snowflakeParameters(snowflakeParameters.orNull)
      .teradataParameters(teradataParameters.orNull)
      .sqlServerParameters(sqlServerParameters.orNull)
      .redshiftParameters(redshiftParameters.orNull)
      .rdsParameters(rdsParameters.orNull)
      .postgreSqlParameters(postgreSqlParameters.orNull)
      .athenaParameters(athenaParameters.orNull)
      .sparkParameters(sparkParameters.orNull)
      .auroraParameters(auroraParameters.orNull)
      .build()
}
