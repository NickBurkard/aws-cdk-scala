package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipelineProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineName: Option[String] = None,
    pipelineActivities: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipelineProps =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .pipelineName(pipelineName.orNull)
      .pipelineActivities(pipelineActivities.map(_.asJava).orNull)
      .build()
}
