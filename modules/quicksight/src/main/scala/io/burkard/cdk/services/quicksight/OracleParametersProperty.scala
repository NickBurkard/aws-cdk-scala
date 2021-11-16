package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OracleParametersProperty {

  def apply(
    database: String,
    host: String,
    port: Number
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.Builder)
      .database(database)
      .host(host)
      .port(port)
      .build()
}
