package io.burkard.cdk.services.lookoutmetrics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3SourceConfigProperty {

  def apply(
    historicalDataPathList: Option[List[String]] = None,
    fileFormatDescriptor: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty] = None,
    templatedPathList: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.Builder)
      .historicalDataPathList(historicalDataPathList.map(_.asJava).orNull)
      .fileFormatDescriptor(fileFormatDescriptor.orNull)
      .templatedPathList(templatedPathList.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
