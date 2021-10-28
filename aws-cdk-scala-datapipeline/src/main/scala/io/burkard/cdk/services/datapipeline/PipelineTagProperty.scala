package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PipelineTagProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
