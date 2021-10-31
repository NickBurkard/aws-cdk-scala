package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MonitoringAppSpecificationProperty {

  def apply(
    recordPreprocessorSourceUri: Option[String] = None,
    imageUri: Option[String] = None,
    containerArguments: Option[List[String]] = None,
    containerEntrypoint: Option[List[String]] = None,
    postAnalyticsProcessorSourceUri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule.MonitoringAppSpecificationProperty.Builder)
      .recordPreprocessorSourceUri(recordPreprocessorSourceUri.orNull)
      .imageUri(imageUri.orNull)
      .containerArguments(containerArguments.map(_.asJava).orNull)
      .containerEntrypoint(containerEntrypoint.map(_.asJava).orNull)
      .postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri.orNull)
      .build()
}
