package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelQualityAppSpecificationProperty {

  def apply(
    imageUri: String,
    problemType: String,
    recordPreprocessorSourceUri: Option[String] = None,
    containerArguments: Option[List[String]] = None,
    environment: Option[Map[String, String]] = None,
    containerEntrypoint: Option[List[String]] = None,
    postAnalyticsProcessorSourceUri: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition.ModelQualityAppSpecificationProperty.Builder)
      .imageUri(imageUri)
      .problemType(problemType)
      .recordPreprocessorSourceUri(recordPreprocessorSourceUri.orNull)
      .containerArguments(containerArguments.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .containerEntrypoint(containerEntrypoint.map(_.asJava).orNull)
      .postAnalyticsProcessorSourceUri(postAnalyticsProcessorSourceUri.orNull)
      .build()
}
