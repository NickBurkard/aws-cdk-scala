package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmrAddStep {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    actionOnFailure: Option[software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure] = None,
    clusterId: Option[String] = None,
    properties: Option[Map[String, String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    args: Option[List[String]] = None,
    jar: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    resultPath: Option[String] = None,
    mainClass: Option[String] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep =
    software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .actionOnFailure(actionOnFailure.orNull)
      .clusterId(clusterId.orNull)
      .properties(properties.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .args(args.map(_.asJava).orNull)
      .jar(jar.orNull)
      .heartbeat(heartbeat.orNull)
      .resultPath(resultPath.orNull)
      .mainClass(mainClass.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}