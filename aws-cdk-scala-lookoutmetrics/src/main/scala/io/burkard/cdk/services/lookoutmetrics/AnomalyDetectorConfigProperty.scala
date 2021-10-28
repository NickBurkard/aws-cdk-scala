package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AnomalyDetectorConfigProperty {

  def apply(
    anomalyDetectorFrequency: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder)
      .anomalyDetectorFrequency(anomalyDetectorFrequency.orNull)
      .build()
}
