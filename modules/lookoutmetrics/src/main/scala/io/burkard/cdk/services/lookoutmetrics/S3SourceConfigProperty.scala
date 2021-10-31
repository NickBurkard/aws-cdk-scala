package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
