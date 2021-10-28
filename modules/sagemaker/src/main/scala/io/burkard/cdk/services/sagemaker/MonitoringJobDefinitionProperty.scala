package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringJobDefinitionProperty {

  def apply(
    monitoringOutputConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringOutputConfigProperty] = None,
    networkConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.NetworkConfigProperty] = None,
    monitoringAppSpecification: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty] = None,
    stoppingCondition: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StoppingConditionProperty] = None,
    roleArn: Option[String] = None,
    environment: Option[Map[String, String]] = None,
    monitoringInputs: Option[List[_]] = None,
    baselineConfig: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty] = None,
    monitoringResources: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringResourcesProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder)
      .monitoringOutputConfig(monitoringOutputConfig.orNull)
      .networkConfig(networkConfig.orNull)
      .monitoringAppSpecification(monitoringAppSpecification.orNull)
      .stoppingCondition(stoppingCondition.orNull)
      .roleArn(roleArn.orNull)
      .environment(environment.map(_.asJava).orNull)
      .monitoringInputs(monitoringInputs.map(_.asJava).orNull)
      .baselineConfig(baselineConfig.orNull)
      .monitoringResources(monitoringResources.orNull)
      .build()
}
