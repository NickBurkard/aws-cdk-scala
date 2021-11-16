package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Task {

  def apply(
    internalResourceId: String,
    task: software.amazon.awscdk.services.stepfunctions.IStepFunctionsTask,
    resultPath: Option[String] = None,
    parameters: Option[Map[String, _]] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Task =
    software.amazon.awscdk.services.stepfunctions.Task.Builder
      .create(stackCtx, internalResourceId)
      .task(task)
      .resultPath(resultPath.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
