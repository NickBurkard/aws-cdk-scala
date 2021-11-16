package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyDetectorProps {

  def apply(
    anomalyDetectorConfig: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty,
    metricSetList: List[_],
    anomalyDetectorDescription: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    anomalyDetectorName: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.Builder)
      .anomalyDetectorConfig(anomalyDetectorConfig)
      .metricSetList(metricSetList.asJava)
      .anomalyDetectorDescription(anomalyDetectorDescription.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .anomalyDetectorName(anomalyDetectorName.orNull)
      .build()
}
