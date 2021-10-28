package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaInvokeProps {

  def apply(
    qualifier: Option[String] = None,
    payload: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    invocationType: Option[software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType] = None,
    retryOnServiceExceptions: Option[Boolean] = None,
    payloadResponseOnly: Option[Boolean] = None,
    resultPath: Option[String] = None,
    lambdaFunction: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    clientContext: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps.Builder)
      .qualifier(qualifier.orNull)
      .payload(payload.orNull)
      .invocationType(invocationType.orNull)
      .retryOnServiceExceptions(retryOnServiceExceptions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .payloadResponseOnly(payloadResponseOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resultPath(resultPath.orNull)
      .lambdaFunction(lambdaFunction.orNull)
      .clientContext(clientContext.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .integrationPattern(integrationPattern.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
