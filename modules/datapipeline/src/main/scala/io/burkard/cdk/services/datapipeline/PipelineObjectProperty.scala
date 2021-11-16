package io.burkard.cdk.services.datapipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineObjectProperty {

  def apply(
    name: String,
    id: String,
    fields: List[_]
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder)
      .name(name)
      .id(id)
      .fields(fields.asJava)
      .build()
}
