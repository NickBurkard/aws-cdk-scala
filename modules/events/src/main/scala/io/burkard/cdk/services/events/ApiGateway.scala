package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApiGateway {

  def apply(
    restApi: software.amazon.awscdk.services.apigateway.RestApi,
    method: Option[String] = None,
    stage: Option[String] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    path: Option[String] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    pathParameterValues: Option[List[String]] = None,
    headerParameters: Option[Map[String, String]] = None,
    postBody: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    retryAttempts: Option[Number] = None,
    queryStringParameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.events.targets.ApiGateway =
    software.amazon.awscdk.services.events.targets.ApiGateway.Builder
      .create(restApi)
      .method(method.orNull)
      .stage(stage.orNull)
      .maxEventAge(maxEventAge.orNull)
      .path(path.orNull)
      .eventRole(eventRole.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .pathParameterValues(pathParameterValues.map(_.asJava).orNull)
      .headerParameters(headerParameters.map(_.asJava).orNull)
      .postBody(postBody.orNull)
      .retryAttempts(retryAttempts.orNull)
      .queryStringParameters(queryStringParameters.map(_.asJava).orNull)
      .build()
}
