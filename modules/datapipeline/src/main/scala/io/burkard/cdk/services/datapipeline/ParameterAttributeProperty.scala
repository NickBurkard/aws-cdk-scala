package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterAttributeProperty {

  def apply(
    key: Option[String] = None,
    stringValue: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder)
      .key(key.orNull)
      .stringValue(stringValue.orNull)
      .build()
}
