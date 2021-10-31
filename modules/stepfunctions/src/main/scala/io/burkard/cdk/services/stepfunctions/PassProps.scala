package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PassProps {

  def apply(
    result: Option[software.amazon.awscdk.services.stepfunctions.Result] = None,
    resultPath: Option[String] = None,
    inputPath: Option[String] = None,
    parameters: Option[Map[String, _]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.PassProps =
    (new software.amazon.awscdk.services.stepfunctions.PassProps.Builder)
      .result(result.orNull)
      .resultPath(resultPath.orNull)
      .inputPath(inputPath.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
