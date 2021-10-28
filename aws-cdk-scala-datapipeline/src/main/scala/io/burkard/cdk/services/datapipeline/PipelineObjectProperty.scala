package io.burkard.cdk.services.datapipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
