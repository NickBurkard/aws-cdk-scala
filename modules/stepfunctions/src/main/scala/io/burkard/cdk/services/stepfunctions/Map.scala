package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Map {

  def apply(
    internalResourceId: String,
    maxConcurrency: Option[Number] = None,
    itemsPath: Option[String] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    parameters: Option[Map[String, _]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Map =
    software.amazon.awscdk.services.stepfunctions.Map.Builder
      .create(stackCtx, internalResourceId)
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
