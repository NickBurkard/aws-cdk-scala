package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricSourceProperty {

  def apply(
    rdsSourceConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RDSSourceConfigProperty] = None,
    cloudwatchConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CloudwatchConfigProperty] = None,
    redshiftSourceConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.RedshiftSourceConfigProperty] = None,
    appFlowConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AppFlowConfigProperty] = None,
    s3SourceConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty.Builder)
      .rdsSourceConfig(rdsSourceConfig.orNull)
      .cloudwatchConfig(cloudwatchConfig.orNull)
      .redshiftSourceConfig(redshiftSourceConfig.orNull)
      .appFlowConfig(appFlowConfig.orNull)
      .s3SourceConfig(s3SourceConfig.orNull)
      .build()
}
