package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataQualityJobDefinition {

  def apply(
    internalResourceId: String,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty] = None,
    dataQualityJobOutputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty] = None,
    dataQualityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty] = None,
    roleArn: Option[String] = None,
    jobDefinitionName: Option[String] = None,
    dataQualityAppSpecification: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    dataQualityJobInput: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty] = None,
    jobResources: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition =
    software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.Builder
      .create(stackCtx, internalResourceId)
      .networkConfig(networkConfig.orNull)
      .dataQualityJobOutputConfig(dataQualityJobOutputConfig.orNull)
      .dataQualityBaselineConfig(dataQualityBaselineConfig.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .roleArn(roleArn.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .dataQualityAppSpecification(dataQualityAppSpecification.orNull)
      .tags(tags.map(_.asJava).orNull)
      .dataQualityJobInput(dataQualityJobInput.orNull)
      .jobResources(jobResources.orNull)
      .build()
}
