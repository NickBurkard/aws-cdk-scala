package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CallApiGatewayRestApiEndpointProps {

  def apply(
    stageName: String,
    api: software.amazon.awscdk.services.apigateway.IRestApi,
    method: Option[software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod] = None,
    apiPath: Option[String] = None,
    resultPath: Option[String] = None,
    authType: Option[software.amazon.awscdk.services.stepfunctions.tasks.AuthType] = None,
    resultSelector: Option[Map[String, _]] = None,
    headers: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    requestBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    queryParameters: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CallApiGatewayRestApiEndpointProps.Builder)
      .stageName(stageName)
      .api(api)
      .method(method.orNull)
      .apiPath(apiPath.orNull)
      .resultPath(resultPath.orNull)
      .authType(authType.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .headers(headers.orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .queryParameters(queryParameters.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
