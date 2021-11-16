package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MySqlParametersProperty {

  def apply(
    database: String,
    host: String,
    port: Number
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.Builder)
      .database(database)
      .host(host)
      .port(port)
      .build()
}
