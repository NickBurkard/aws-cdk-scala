package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CallApiGatewayHttpApiEndpointProps {

  def apply(
    apiStack: software.amazon.awscdk.Stack,
    apiId: String,
    method: Option[software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod] = None,
    apiPath: Option[String] = None,
    resultPath: Option[String] = None,
    authType: Option[software.amazon.awscdk.services.stepfunctions.tasks.AuthType] = None,
    stageName: Option[String] = None,
    resultSelector: Option[Map[String, _]] = None,
    queryParameters: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    headers: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    requestBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayHttpApiEndpointProps.Builder)
      .apiStack(apiStack)
      .apiId(apiId)
      .method(method.orNull)
      .apiPath(apiPath.orNull)
      .resultPath(resultPath.orNull)
      .authType(authType.orNull)
      .stageName(stageName.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .queryParameters(queryParameters.orNull)
      .headers(headers.orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
