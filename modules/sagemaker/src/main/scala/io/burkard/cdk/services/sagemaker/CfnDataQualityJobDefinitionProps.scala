package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataQualityJobDefinitionProps {

  def apply(
    dataQualityJobOutputConfig: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringOutputConfigProperty,
    roleArn: String,
    dataQualityAppSpecification: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty,
    dataQualityJobInput: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityJobInputProperty,
    jobResources: software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.NetworkConfigProperty] = None,
    dataQualityBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.StoppingConditionProperty] = None,
    jobDefinitionName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps.Builder)
      .dataQualityJobOutputConfig(dataQualityJobOutputConfig)
      .roleArn(roleArn)
      .dataQualityAppSpecification(dataQualityAppSpecification)
      .dataQualityJobInput(dataQualityJobInput)
      .jobResources(jobResources)
      .networkConfig(networkConfig.orNull)
      .dataQualityBaselineConfig(dataQualityBaselineConfig.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
