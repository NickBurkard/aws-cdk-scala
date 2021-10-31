package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterValueProperty {

  def apply(
    id: Option[String] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder)
      .id(id.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
