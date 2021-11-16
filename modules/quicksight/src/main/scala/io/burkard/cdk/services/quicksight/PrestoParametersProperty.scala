package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrestoParametersProperty {

  def apply(
    catalog: String,
    host: String,
    port: Number
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.Builder)
      .catalog(catalog)
      .host(host)
      .port(port)
      .build()
}
