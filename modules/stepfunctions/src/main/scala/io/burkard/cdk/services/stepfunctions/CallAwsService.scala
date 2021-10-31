package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CallAwsService {

  def apply(
    internalResourceId: String,
    iamAction: Option[String] = None,
    resultPath: Option[String] = None,
    service: Option[String] = None,
    iamResources: Option[List[String]] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    parameters: Option[Map[String, _]] = None,
    action: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService =
    software.amazon.awscdk.services.stepfunctions.tasks.CallAwsService.Builder
      .create(stackCtx, internalResourceId)
      .iamAction(iamAction.orNull)
      .resultPath(resultPath.orNull)
      .service(service.orNull)
      .iamResources(iamResources.map(_.asJava).orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
