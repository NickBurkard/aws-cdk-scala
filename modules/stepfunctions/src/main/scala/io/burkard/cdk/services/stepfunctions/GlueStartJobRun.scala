package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlueStartJobRun {

  def apply(
    internalResourceId: String,
    resultPath: Option[String] = None,
    securityConfiguration: Option[String] = None,
    notifyDelayAfter: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    glueJobName: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    arguments: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun =
    software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun.Builder
      .create(stackCtx, internalResourceId)
      .resultPath(resultPath.orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .notifyDelayAfter(notifyDelayAfter.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .glueJobName(glueJobName.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .heartbeat(heartbeat.orNull)
      .arguments(arguments.orNull)
      .build()
}
