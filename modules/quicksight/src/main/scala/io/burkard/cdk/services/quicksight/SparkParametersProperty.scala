package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SparkParametersProperty {

  def apply(
    host: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty.Builder)
      .host(host.orNull)
      .port(port.orNull)
      .build()
}
