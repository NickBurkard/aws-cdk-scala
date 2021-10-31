package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPipelineProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    pipelineDescription: Option[String] = None,
    pipelineName: Option[String] = None,
    pipelineDefinition: Option[AnyRef] = None,
    roleArn: Option[String] = None,
    pipelineDisplayName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnPipelineProps =
    (new software.amazon.awscdk.services.sagemaker.CfnPipelineProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .pipelineDescription(pipelineDescription.orNull)
      .pipelineName(pipelineName.orNull)
      .pipelineDefinition(pipelineDefinition.orNull)
      .roleArn(roleArn.orNull)
      .pipelineDisplayName(pipelineDisplayName.orNull)
      .build()
}
