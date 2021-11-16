package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CallAwsService {

  def apply(
    internalResourceId: String,
    service: String,
    iamResources: List[String],
    action: String,
    iamAction: Option[String] = None,
    resultPath: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    parameters: Option[Map[String, _]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService =
    software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.Builder
      .create(stackCtx, internalResourceId)
      .service(service)
      .iamResources(iamResources.asJava)
      .action(action)
      .iamAction(iamAction.orNull)
      .resultPath(resultPath.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
