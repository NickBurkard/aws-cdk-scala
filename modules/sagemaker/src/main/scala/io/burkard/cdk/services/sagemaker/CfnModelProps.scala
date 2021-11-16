package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelProps {

  def apply(
    executionRoleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty] = None,
    modelName: Option[String] = None,
    primaryContainer: Option[software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty] = None,
    containers: Option[List[_]] = None,
    inferenceExecutionConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder)
      .executionRoleArn(executionRoleArn)
      .tags(tags.map(_.asJava).orNull)
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcConfig(vpcConfig.orNull)
      .modelName(modelName.orNull)
      .primaryContainer(primaryContainer.orNull)
      .containers(containers.map(_.asJava).orNull)
      .inferenceExecutionConfig(inferenceExecutionConfig.orNull)
      .build()
}
