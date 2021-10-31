package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Parallel {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Parallel =
    software.amazon.awscdk.services.stepfunctions.Parallel.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
