package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipeline {

  def apply(
    internalResourceId: String,
    pipelineName: String,
    pipelineDefinition: AnyRef,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineDescription: Option[String] = None,
    pipelineDisplayName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnPipeline =
    software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder
      .create(stackCtx, internalResourceId)
      .pipelineName(pipelineName)
      .pipelineDefinition(pipelineDefinition)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .pipelineDescription(pipelineDescription.orNull)
      .pipelineDisplayName(pipelineDisplayName.orNull)
      .build()
}
