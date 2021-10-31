package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SageMakerCreateEndpoint {

  def apply(
    internalResourceId: String,
    tags: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    resultPath: Option[String] = None,
    endpointConfigName: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    endpointName: Option[String] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint =
    software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.orNull)
      .resultPath(resultPath.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .endpointName(endpointName.orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
