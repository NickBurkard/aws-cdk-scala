package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModelExplainabilityJobDefinition {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition =
    software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.Builder
      .create(stackCtx, internalResourceId)
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
