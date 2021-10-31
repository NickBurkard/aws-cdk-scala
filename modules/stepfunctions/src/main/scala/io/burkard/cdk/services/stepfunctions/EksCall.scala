package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EksCall {

  def apply(
    internalResourceId: String,
    httpPath: Option[String] = None,
    httpMethod: Option[software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods] = None,
    resultPath: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    resultSelector: Option[Map[String, _]] = None,
    queryParameters: Option[Map[String, _ <: List[String]]] = None,
    heartbeat: Option[software.amazon.awscdk.Duration] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None,
    requestBody: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.IntegrationPattern] = None,
    inputPath: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.tasks.EksCall =
    software.amazon.awscdk.services.stepfunctions.tasks.EksCall.Builder
      .create(stackCtx, internalResourceId)
      .httpPath(httpPath.orNull)
      .httpMethod(httpMethod.orNull)
      .resultPath(resultPath.orNull)
      .cluster(cluster.orNull)
      .resultSelector(resultSelector.map(_.asJava).orNull)
      .queryParameters(queryParameters.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .heartbeat(heartbeat.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .requestBody(requestBody.orNull)
      .integrationPattern(integrationPattern.orNull)
      .inputPath(inputPath.orNull)
      .timeout(timeout.orNull)
      .build()
}
