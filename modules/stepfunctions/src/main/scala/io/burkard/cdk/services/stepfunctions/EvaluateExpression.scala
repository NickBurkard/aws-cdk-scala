package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EvaluateExpression {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    expression: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    runtime: Option[software.amazon.awscdk.services.lambda.Runtime] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression =
    software.amazon.awscdk.services.stepfunctions.tasks.EvaluateExpression.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .expression(expression.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .runtime(runtime.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
