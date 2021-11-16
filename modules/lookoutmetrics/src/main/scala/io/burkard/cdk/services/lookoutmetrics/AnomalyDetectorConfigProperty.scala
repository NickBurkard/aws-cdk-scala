package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnomalyDetectorConfigProperty {

  def apply(
    anomalyDetectorFrequency: String
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder)
      .anomalyDetectorFrequency(anomalyDetectorFrequency)
      .build()
}
