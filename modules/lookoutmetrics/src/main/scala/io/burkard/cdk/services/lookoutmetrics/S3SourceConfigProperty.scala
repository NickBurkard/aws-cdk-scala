package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourceConfigProperty {

  def apply(
    fileFormatDescriptor: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.FileFormatDescriptorProperty,
    roleArn: String,
    historicalDataPathList: Option[List[String]] = None,
    templatedPathList: Option[List[String]] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.S3SourceConfigProperty.Builder)
      .fileFormatDescriptor(fileFormatDescriptor)
      .roleArn(roleArn)
      .historicalDataPathList(historicalDataPathList.map(_.asJava).orNull)
      .templatedPathList(templatedPathList.map(_.asJava).orNull)
      .build()
}
