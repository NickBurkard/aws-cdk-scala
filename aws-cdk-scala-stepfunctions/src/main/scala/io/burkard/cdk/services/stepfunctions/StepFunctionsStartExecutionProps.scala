package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepFunctionsStartExecutionProps {

  def apply(
    name: Option[String] = None,
    resultPath: Option[String] = None,
    stateMachine: Option[software.amazon.awscdk.services.stepfunctions.IStateMachine] = None,
    input: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    associateWithParent: Option[Boolean] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps.Builder)
      .name(name.orNull)
      .resultPath(resultPath.orNull)
      .stateMachine(stateMachine.orNull)
      .input(input.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .associateWithParent(associateWithParent.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
