package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AthenaStartQueryExecutionProps {

  def apply(
    queryString: String,
    workGroup: Option[String] = None,
    resultPath: Option[String] = None,
    clientRequestToken: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    queryExecutionContext: Option[software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext] = None,
    resultConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.AthenaStartQueryExecutionProps.Builder)
      .queryString(queryString)
      .workGroup(workGroup.orNull)
      .resultPath(resultPath.orNull)
      .clientRequestToken(clientRequestToken.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .queryExecutionContext(queryExecutionContext.orNull)
      .resultConfiguration(resultConfiguration.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
