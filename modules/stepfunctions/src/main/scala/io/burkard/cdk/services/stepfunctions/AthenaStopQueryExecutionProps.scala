package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AthenaStopQueryExecutionProps {

  def apply(
    queryExecutionId: String,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.AthenaStopQueryExecutionProps.Builder)
      .queryExecutionId(queryExecutionId)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .build()
}
