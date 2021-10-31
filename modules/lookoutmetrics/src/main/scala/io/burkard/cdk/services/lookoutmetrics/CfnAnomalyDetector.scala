package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnomalyDetector {

  def apply(
    internalResourceId: String,
    anomalyDetectorDescription: Option[String] = None,
    anomalyDetectorConfig: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty] = None,
    metricSetList: Option[List[_]] = None,
    kmsKeyArn: Option[String] = None,
    anomalyDetectorName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector =
    software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder
      .create(stackCtx, internalResourceId)
      .anomalyDetectorDescription(anomalyDetectorDescription.orNull)
      .anomalyDetectorConfig(anomalyDetectorConfig.orNull)
      .metricSetList(metricSetList.map(_.asJava).orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .anomalyDetectorName(anomalyDetectorName.orNull)
      .build()
}
