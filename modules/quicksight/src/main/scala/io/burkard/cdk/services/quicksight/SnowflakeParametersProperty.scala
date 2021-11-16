package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnowflakeParametersProperty {

  def apply(
    database: String,
    host: String,
    warehouse: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.Builder)
      .database(database)
      .host(host)
      .warehouse(warehouse)
      .build()
}
