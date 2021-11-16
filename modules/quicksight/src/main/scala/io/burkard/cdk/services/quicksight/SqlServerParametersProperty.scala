package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqlServerParametersProperty {

  def apply(
    database: String,
    host: String,
    port: Number
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.Builder)
      .database(database)
      .host(host)
      .port(port)
      .build()
}
