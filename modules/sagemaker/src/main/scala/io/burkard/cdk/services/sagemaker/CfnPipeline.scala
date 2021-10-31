package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPipeline {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineDescription: Option[String] = None,
    pipelineName: Option[String] = None,
    pipelineDefinition: Option[AnyRef] = None,
    roleArn: Option[String] = None,
    pipelineDisplayName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnPipeline =
    software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .pipelineDescription(pipelineDescription.orNull)
      .pipelineName(pipelineName.orNull)
      .pipelineDefinition(pipelineDefinition.orNull)
      .roleArn(roleArn.orNull)
      .pipelineDisplayName(pipelineDisplayName.orNull)
      .build()
}
