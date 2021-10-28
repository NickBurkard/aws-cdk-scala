package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModel {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty] = None,
    modelName: Option[String] = None,
    executionRoleArn: Option[String] = None,
    primaryContainer: Option[software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty] = None,
    containers: Option[List[_]] = None,
    inferenceExecutionConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModel =
    software.amazon.awscdk.services.sagemaker.CfnModel.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .enableNetworkIsolation(enableNetworkIsolation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcConfig(vpcConfig.orNull)
      .modelName(modelName.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .primaryContainer(primaryContainer.orNull)
      .containers(containers.map(_.asJava).orNull)
      .inferenceExecutionConfig(inferenceExecutionConfig.orNull)
      .build()
}
