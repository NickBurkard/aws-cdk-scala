package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlueStartJobRunProps {

  def apply(
    glueJobName: String,
    resultPath: Option[String] = None,
    securityConfiguration: Option[String] = None,
    notifyDelayAfter: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    arguments: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps.Builder)
      .glueJobName(glueJobName)
      .resultPath(resultPath.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .notifyDelayAfter(notifyDelayAfter.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .arguments(arguments.orNull)
      .build()
}
