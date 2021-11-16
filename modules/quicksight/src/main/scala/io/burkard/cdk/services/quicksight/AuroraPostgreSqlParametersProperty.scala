package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AuroraPostgreSqlParametersProperty {

  def apply(
    database: String,
    host: String,
    port: Number
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty.Builder)
      .database(database)
      .host(host)
      .port(port)
      .build()
}
