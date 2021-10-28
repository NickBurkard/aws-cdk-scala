package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuroraParametersProperty {

  def apply(
    database: Option[String] = None,
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty.Builder)
      .database(database.orNull)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}