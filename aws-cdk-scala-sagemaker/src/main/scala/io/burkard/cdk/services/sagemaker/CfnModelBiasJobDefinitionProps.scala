package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModelBiasJobDefinitionProps {

  def apply(
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobResources: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty] = None,
    modelBiasAppSpecification: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty] = None,
    roleArn: Option[String] = None,
    modelBiasJobInput: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty] = None,
    jobDefinitionName: Option[String] = None,
    modelBiasBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty] = None,
    modelBiasJobOutputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps.Builder)
      .networkConfig(networkConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .jobResources(jobResources.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .modelBiasAppSpecification(modelBiasAppSpecification.orNull)
      .roleArn(roleArn.orNull)
      .modelBiasJobInput(modelBiasJobInput.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .modelBiasBaselineConfig(modelBiasBaselineConfig.orNull)
      .modelBiasJobOutputConfig(modelBiasJobOutputConfig.orNull)
      .build()
}
