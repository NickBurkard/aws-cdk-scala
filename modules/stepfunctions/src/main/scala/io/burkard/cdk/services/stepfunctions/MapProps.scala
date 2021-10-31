package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MapProps {

  def apply(
    maxConcurrency: Option[Number] = None,
    itemsPath: Option[String] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    parameters: Option[Map[String, _]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.MapProps =
    (new software.amazon.awscdk.services.stepfunctions.MapProps.Builder)
      .maxConcurrency(maxConcurrency.orNull)
      .itemsPath(itemsPath.orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
