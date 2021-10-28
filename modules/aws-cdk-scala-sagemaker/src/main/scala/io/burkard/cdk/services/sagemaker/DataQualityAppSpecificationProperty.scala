package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataQualityAppSpecificationProperty {

  def apply(
    recordPreprocessorSourceUri: Option[String] = None,
    imageUri: Option[String] = None,
    containerArguments: Option[List[String]] = None,
    environment: Option[Map[String, String]] = None,
    containerEntrypoint: Option[List[String]] = None,
    postAnalyticsProcessorSourceUri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty.Builder)
      .recordPreprocessorSourceUri(recordPreprocessorSourceUri.orNull)
      .imageUri(imageUri.orNull)
      .containerArguments(containerArguments.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .containerEntrypoint(containerEntrypoint.map(_.asJava).orNull)
      .postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri.orNull)
      .build()
}
