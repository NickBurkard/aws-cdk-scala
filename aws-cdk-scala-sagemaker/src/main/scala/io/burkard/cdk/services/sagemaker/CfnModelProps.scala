package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModelProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    enableNetworkIsolation: Option[Boolean] = None,
    vpcConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.VpcConfigProperty] = None,
    modelName: Option[String] = None,
    executionRoleArn: Option[String] = None,
    primaryContainer: Option[software.amazon.awscdk.services.sagemaker.CfnModel.ContainerDefinitionProperty] = None,
    containers: Option[List[_]] = None,
    inferenceExecutionConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModel.InferenceExecutionConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelProps.Builder)
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
