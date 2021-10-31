package io.burkard.cdk.services.datapipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PipelineObjectProperty {

  def apply(
    name: Option[String] = None,
    id: Option[String] = None,
    fields: Option[List[_]] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder)
      .name(name.orNull)
      .id(id.orNull)
      .fields(fields.map(_.asJava).orNull)
      .build()
}
