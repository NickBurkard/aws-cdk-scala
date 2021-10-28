package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModelExplainabilityJobDefinitionProps {

  def apply(
    modelExplainabilityJobInput: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityJobInputProperty] = None,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.NetworkConfigProperty] = None,
    modelExplainabilityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityBaselineConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobResources: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty] = None,
    roleArn: Option[String] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.StoppingConditionProperty] = None,
    modelExplainabilityJobOutputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringOutputConfigProperty] = None,
    modelExplainabilityAppSpecification: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty] = None,
    jobDefinitionName: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps.Builder)
      .modelExplainabilityJobInput(modelExplainabilityJobInput.orNull)
      .networkConfig(networkConfig.orNull)
      .modelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .jobResources(jobResources.orNull)
      .roleArn(roleArn.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .modelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig.orNull)
      .modelExplainabilityAppSpecification(modelExplainabilityAppSpecification.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .build()
}
