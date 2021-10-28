package io.burkard.cdk.services.datapipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPipelineProps {

  def apply(
    name: Option[String] = None,
    parameterObjects: Option[List[_]] = None,
    description: Option[String] = None,
    parameterValues: Option[List[_]] = None,
    pipelineTags: Option[List[_]] = None,
    pipelineObjects: Option[List[_]] = None,
    activate: Option[Boolean] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipelineProps =
    (new software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder)
      .name(name.orNull)
      .parameterObjects(parameterObjects.map(_.asJava).orNull)
      .description(description.orNull)
      .parameterValues(parameterValues.map(_.asJava).orNull)
      .pipelineTags(pipelineTags.map(_.asJava).orNull)
      .pipelineObjects(pipelineObjects.map(_.asJava).orNull)
      .activate(activate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
