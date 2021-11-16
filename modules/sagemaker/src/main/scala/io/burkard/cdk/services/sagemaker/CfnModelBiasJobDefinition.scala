package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelBiasJobDefinition {

  def apply(
    internalResourceId: String,
    jobResources: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringResourcesProperty,
    modelBiasAppSpecification: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty,
    roleArn: String,
    modelBiasJobInput: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasJobInputProperty,
    modelBiasJobOutputConfig: software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.MonitoringOutputConfigProperty,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.NetworkConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.StoppingConditionProperty] = None,
    jobDefinitionName: Option[String] = None,
    modelBiasBaselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition =
    software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.Builder
      .create(stackCtx, internalResourceId)
      .jobResources(jobResources)
      .modelBiasAppSpecification(modelBiasAppSpecification)
      .roleArn(roleArn)
      .modelBiasJobInput(modelBiasJobInput)
      .modelBiasJobOutputConfig(modelBiasJobOutputConfig)
      .networkConfig(networkConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .jobDefinitionName(jobDefinitionName.orNull)
      .modelBiasBaselineConfig(modelBiasBaselineConfig.orNull)
      .build()
}
