package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Pass {

  def apply(
    internalResourceId: String,
    result: Option[software.amazon.awscdk.services.stepfunctions.Result] = None,
    resultPath: Option[String] = None,
    inputPath: Option[String] = None,
    parameters: Option[Map[String, _]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Pass =
    software.amazon.awscdk.services.stepfunctions.Pass.Builder
      .create(stackCtx, internalResourceId)
      .result(result.orNull)
      .resultPath(resultPath.orNull)
      .inputPath(inputPath.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
