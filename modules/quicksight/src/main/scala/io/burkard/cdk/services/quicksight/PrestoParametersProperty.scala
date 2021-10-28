package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrestoParametersProperty {

  def apply(
    catalog: Option[String] = None,
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.Builder)
      .catalog(catalog.orNull)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}
