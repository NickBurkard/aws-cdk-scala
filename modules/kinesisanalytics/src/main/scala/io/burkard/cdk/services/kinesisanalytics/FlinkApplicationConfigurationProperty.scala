package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlinkApplicationConfigurationProperty {

  def apply(
    checkpointConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CheckpointConfigurationProperty] = None,
    monitoringConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MonitoringConfigurationProperty] = None,
    parallelismConfiguration: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.FlinkApplicationConfigurationProperty.Builder)
      .checkpointConfiguration(checkpointConfiguration.orNull)
      .monitoringConfiguration(monitoringConfiguration.orNull)
      .parallelismConfiguration(parallelismConfiguration.orNull)
      .build()
}
