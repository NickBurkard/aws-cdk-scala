package io.burkard.cdk.services.lookoutmetrics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalyDetectorProps {

  def apply(
    anomalyDetectorDescription: Option[String] = None,
    anomalyDetectorConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty] = None,
    metricSetList: Option[List[_]] = None,
    kmsKeyArn: Option[String] = None,
    anomalyDetectorName: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.Builder)
      .anomalyDetectorDescription(anomalyDetectorDescription.orNull)
      .anomalyDetectorConfig(anomalyDetectorConfig.orNull)
      .metricSetList(metricSetList.map(_.asJava).orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .anomalyDetectorName(anomalyDetectorName.orNull)
      .build()
}
