package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnomalyDetector {

  def apply(
    internalResourceId: String,
    anomalyDetectorConfig: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.AnomalyDetectorConfigProperty,
    metricSetList: List[_],
    anomalyDetectorDescription: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    anomalyDetectorName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector =
    software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.Builder
      .create(stackCtx, internalResourceId)
      .anomalyDetectorConfig(anomalyDetectorConfig)
      .metricSetList(metricSetList.asJava)
      .anomalyDetectorDescription(anomalyDetectorDescription.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .anomalyDetectorName(anomalyDetectorName.orNull)
      .build()
}
