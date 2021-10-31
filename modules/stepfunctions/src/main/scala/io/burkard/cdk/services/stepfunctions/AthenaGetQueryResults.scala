package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AthenaGetQueryResults {

  def apply(
    internalResourceId: String,
    maxResults: Option[Number] = None,
    nextToken: Option[String] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    queryExecutionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults =
    software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults.Builder
      .create(stackCtx, internalResourceId)
      .maxResults(maxResults.orNull)
      .nextToken(nextToken.orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .queryExecutionId(queryExecutionId.orNull)
      .build()
}
