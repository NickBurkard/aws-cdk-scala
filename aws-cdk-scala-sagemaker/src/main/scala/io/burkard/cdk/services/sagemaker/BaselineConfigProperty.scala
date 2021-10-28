package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaselineConfigProperty {

  def apply(
    constraintsResource: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.ConstraintsResourceProperty] = None,
    statisticsResource: Option[software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.StatisticsResourceProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.BaselineConfigProperty.Builder)
      .constraintsResource(constraintsResource.orNull)
      .statisticsResource(statisticsResource.orNull)
      .build()
}
