package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringJobDefinitionProperty {

  def apply(
    monitoringOutputConfig: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty,
    monitoringAppSpecification: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty,
    roleArn: String,
    monitoringInputs: List[_],
    monitoringResources: software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty] = None,
    environment: Option[Map[String, String]] = None,
    baselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder)
      .monitoringOutputConfig(monitoringOutputConfig)
      .monitoringAppSpecification(monitoringAppSpecification)
      .roleArn(roleArn)
      .monitoringInputs(monitoringInputs.asJava)
      .monitoringResources(monitoringResources)
      .networkConfig(networkConfig.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .environment(environment.map(_.asJava).orNull)
      .baselineConfig(baselineConfig.orNull)
      .build()
}
