package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParallelProps {

  def apply(
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.ParallelProps =
    (new software.amazon.awscdk.services.stepfunctions.ParallelProps.Builder)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
