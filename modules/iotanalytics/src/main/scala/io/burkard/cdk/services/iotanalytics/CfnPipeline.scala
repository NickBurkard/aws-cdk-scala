package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipeline {

  def apply(
    internalResourceId: String,
    pipelineActivities: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotanalytics.CfnPipeline =
    software.amazon.awscdk.services.iotanalytics.CfnPipeline.Builder
      .create(stackCtx, internalResourceId)
      .pipelineActivities(pipelineActivities.asJava)
      .tags(tags.map(_.asJava).orNull)
      .pipelineName(pipelineName.orNull)
      .build()
}
