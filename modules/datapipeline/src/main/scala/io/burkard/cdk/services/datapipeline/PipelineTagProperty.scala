package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineTagProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
