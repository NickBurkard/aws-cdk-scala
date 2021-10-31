package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnowflakeParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    warehouse: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .warehouse(warehouse.orNull)
      .build()
}
