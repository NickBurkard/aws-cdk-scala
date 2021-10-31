package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelQualityJobDefinition {

  def apply(
    internalResourceId: String,
    modelQualityJobInput: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityJobInputProperty] = None,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.NetworkConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    jobResources: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringResourcesProperty] = None,
    roleArn: Option[String] = None,
    jobDefinitionName: Option[String] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.StoppingConditionProperty] = None,
    modelQualityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityBaselineConfigProperty] = None,
    modelQualityAppSpecification: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty] = None,
    modelQualityJobOutputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.MonitoringOutputConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition =
    software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.Builder
      .create(stackCtx, internalResourceId)
      .modelQualityJobInput(modelQualityJobInput.orNull)
      .networkConfig(networkConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .jobResources(jobResources.orNull)
      .roleArn(roleArn.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .modelQualityBaselineConfig(modelQualityBaselineConfig.orNull)
      .modelQualityAppSpecification(modelQualityAppSpecification.orNull)
      .modelQualityJobOutputConfig(modelQualityJobOutputConfig.orNull)
      .build()
}
