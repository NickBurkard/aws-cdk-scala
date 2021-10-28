package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedshiftParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    clusterId: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .clusterId(clusterId.orNull)
      .port(port.orNull)
      .build()
}
